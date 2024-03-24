// Nama : Dofi Saputra
// NIM  : 41522110006

package org.example;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node("Ravenna", 0);
        Node node2 = new Node("Rimini", 0.5);
        Node node3 = new Node("Ferrara", 5);
        Node node4 = new Node("Forli", 2);
        Node node5 = new Node("Cesana", 4.5);
        Node node6 = new Node("Faenza", 4);
        Node node7 = new Node("Imola", 5);
        Node node8 = new Node("Emilia", 6);
        Node node9 = new Node("Terme", 7);
        Node node10 = new Node("Carpi", 8);
        Node node11 = new Node("Piacenza", 10);
        Node node12 = new Node("Bobbia", 10.5);

        node12.connect(new Edge(5, node11));
        node12.connect(new Edge(3, node9));
        node12.connect(new Edge(15, node5));

        node11.connect(new Edge(3, node10));
        node11.connect(new Edge(3, node9));

        node9.connect(new Edge(2, node8));
        node9.connect(new Edge(3, node6));

        node6.connect(new Edge(2, node4));
        node6.connect(new Edge(6, node5));

        node5.connect(new Edge(5, node2));

        node4.connect(new Edge(2, node5));
        node4.connect(new Edge(3, node1));

        node7.connect(new Edge(3, node4));
        node7.connect(new Edge(1, node6));

        node8.connect(new Edge(2, node7));

        node10.connect(new Edge(2, node8));
        node10.connect(new Edge(8, node3));

        node3.connect(new Edge(3, node7));
        node3.connect(new Edge(6, node1));

        node2.connect(new Edge(1, node1));

        AStarSearch aStarSearch = new AStarSearch();
        aStarSearch.doAStarSearch(node12, node1);
        System.out.print("\nRutenya : ");
        aStarSearch.printRute(node1);
        System.out.print("\nCost Total : " + aStarSearch.getCostTotal());
    }

}