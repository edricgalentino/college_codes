// Nama : Dofi Saputra
// NIM  : 41522110006

package org.example;

public class Edge {

    private double cost;
    private Node targetNode;

    public Edge(double cost, Node targetNode) {
        this.cost = cost;
        this.targetNode = targetNode;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Node getTargetNode() {
        return targetNode;
    }

    public void setTargetNode(Node targetNode) {
        this.targetNode = targetNode;
    }

}
