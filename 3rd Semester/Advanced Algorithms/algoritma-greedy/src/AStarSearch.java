
public class Astarsearch {  
private double costtotal;  
public void Astarsearch(Node start, Node goal) {  
ArrayList  <Node> closed = new ArrayList  <Node>();  
ArrayList  <Node> open = new ArrayList  <Node>();  
open.add(start);  
start. setFn(start.getGn()+start.getHn());  
System.out.print(s:" OPEN : ");  
System.out.println(open);  
while (open.isEmpty ()== false ){  
Node best;  
if (open.contains(goal)) {  
int position = open. indexof(goal);  
best = open cdot get (position);  
} else {  
//selection sort  
for (int i=0; i< open.size () -1 ; i++ ) {  
int min =i;  
for (int j=i+1 ; j< open.size (); j++){  
if (open.get (j).getFn()<open.get(min).getFn()){  
min =j;  
}  
}  
Node temp = open.get (min );  
open.set(min, open.get(i));  
open.set( i, temp);  
}  
best = open.get( index: 0);  
}

if (open. contains(best)) {  
open. remove(best);  
}  
  
System.out.print(s:" CLOSED : ");  
system.out.println(closed);  
closed.add(best);  
System.out.println(" ***BEST NODE : "+best.getNama()+"***");  
system.out.print(s:" OPEN : ");  
System.out.println(open);  
System.out.print(s:" CLOSED : ");  
system.out.println(closed);  
system.out.println();  
system.out.println();  
if (best. getNama ()== goal.getNama()){  
return;  
}