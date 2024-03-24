// Nama : Dofi Saputra
// NIM  : 41522110006

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String nama;
    private double gn;
    private double fn;
    private double hn;
    private List<Edge> childList;
    private Node parentNode;

    @Override
    public String toString() {
        return this.nama + "(" + this.fn + ")";
    }

    public Node(String nama,  double hn) {
        this.nama = nama;
        this.hn = hn;
        this.childList = new ArrayList<>();
    }

    public void connect(Edge edge) {
        this.childList.add(edge);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGn() {
        return gn;
    }

    public void setGn(double gn) {
        this.gn = gn;
    }

    public double getFn() {
        return fn;
    }

    public void setFn(double fn) {
        this.fn = fn;
    }

    public double getHn() {
        return hn;
    }

    public void setHn(double hn) {
        this.hn = hn;
    }

    public List<Edge> getChildList() {
        return childList;
    }

    public void setChildList(List<Edge> childList) {
        this.childList = childList;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

}
