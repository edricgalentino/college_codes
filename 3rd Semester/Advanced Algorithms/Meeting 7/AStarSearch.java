// Nama : Dofi Saputra
// NIM  : 41522110006

package org.example;

import java.util.ArrayList;
import java.util.List;

public class AStarSearch {

    private double costTotal;

    public void doAStarSearch(Node start, Node goal) {
        List<Node> closed = new ArrayList<>();
        List<Node> open = new ArrayList<>();
        open.add(start);
        start.setFn(start.getGn() + start.getHn());

        System.out.println("OPEN: " + open);
        while (!open.isEmpty()) {
            Node best;
            if (open.contains(goal)) {
                int position = open.indexOf(goal);
                best = open.get(position);
            } else {
                for (int i = 0; i < open.size(); i++) {
                    int min = i;
                    for (int j = i + 1; j < open.size(); j++) {
                        if (open.get(j).getFn() < open.get(min).getFn()) {
                            min = j;
                        }
                    }
                    Node temp = open.get(min);
                    open.set(min, open.get(i));
                    open.set(i, temp);
                }
                best = open.get(0);
            }

            if (open.contains(best)) {
                open.remove(best);
            }

            System.out.println("CLOSED: " + closed);
            closed.add(best);
            System.out.println("*** BEST NODE: " + best.getNama() + " ***");
            System.out.println("OPEN: " + open);
            System.out.println("CLOSED: " + closed);

            if (best.getNama().equals(goal.getNama())) {
                return;
            }

            for (Edge edge : best.getChildList()) {
                Node child = edge.getTargetNode();
                double tempCost = edge.getCost();
                double tempGn = best.getGn() + tempCost;
                double tempFn = tempGn + child.getHn();

                if (closed.contains(child)) {
                    continue;
                } else if (!open.contains(child)) {
                    child.setFn(tempFn);
                    child.setGn(tempGn);
                    child.setParentNode(best);
                    if (open.contains(child)) {
                        open.remove(child);
                    }
                    open.add(child);
                }
            }
            System.out.println("OPEN: " + open);
        }
    }

    public void printRute(Node goal) {
        List<Node> rute = new ArrayList<>();
        for (Node node = goal; node != null; node = node.getParentNode()) {
            rute.add(node);
        }
        assert goal != null;
        costTotal = goal.getGn();

        for (int i = rute.size() - 1; i >= 0; i--) {
            System.out.print(rute.get(i).getNama() + ((i == 0) ? "" : " -> "));
        }
    }

    public double getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(double costTotal) {
        this.costTotal = costTotal;
    }

}
