public class Main {  
public static void main(String[] args) {  
Node node1 = new Node (nama: "Ravenna", hn:0);
Node node2 = new Node(nama: "Rimini", hn:0.5);
Node node3 = new Node(nama: "Ferrara", hn:5);
Node node4 = new Node(nama: "Forli", hn:2);
Node node5 = new Node(nama: "Cesena", hn:4.5);
Node node6 = new Node(nama: "Faenza", hn:4);
Node node7 = new Node(nama: "Imola",hn:5);
Node node8 = new Node(nama: "Emilia", hn:6);
Node node9 = new Node (nama: "Terme", hn:7);
Node node10 = new Node(nama: "Carpi", hn:8);
Node node11 = new Node(nama: "Piacenza", hn:10);
Node node12 = new Node(nama: "Bobbia", hn:10.5);
node12.connect (new Edge(node11, cost:5));
node12.connect (new Edge(node9, cost:3));
node12.connect (new Edge(node5, cost:15));
node11.connect (new Edge(node10, cost:3));
node11.connect (new Edge(node9, cost:3));
node9.connect (new Edge(node8, cost:2));
node9.connect (new Edge(node6, cost:3));
node6.connect(new Edge(node4, cost:2));
node6.connect (new Edge(node5, cost:6));
node5.connect(new Edge(node2, cost:5));
node4.connect (new Edge(node5, cost:2));
node4.connect (new Edge(node1, cost:3));

node7.connect(new Edge(node4, cost:3));
node7.connect(new Edge(node6, cost:1));
node8.connect(new Edge(node7, cost:2));
node10.connect(new Edge(node8, cost:2));
node10.connect(new Edge(node3, cost:8));
node3.connect(new Edge(node7, cost:3));
node3.connect(new Edge(node1, cost:6));
node2.connect(new Edge(node1, cost:1));
Astarsearch astar = new Astarsearch();
astar. Astarsearch(node12, node1);
System.out.println();
System.out.print(s: "Rutenya : ");
astar.printRute(node1);
System.out.println();
System.out.println("Costnya : "+astar.getcosttotal());
}  
}