/*
================= LINKED LIST IMPORTANT POINTS =================
Each node stores:
      -> data
      -> address of next node
Node Structure:
      [ data | next ]
Head:
      -> Starting node of linked list
      -> Traversal always starts from head
Traversal:
      -> Moving node by node using next
Important Condition:
      while(head != null)
      -> Used to traverse complete linked list
head.next != null
      -> Stops at second last node
Recursive Traversal:
      -> Function calls itself
Reverse Printing Logic:
      -> Move first
      -> Print while returning back
Time Complexity:
      Traversal = O(n)
===============================================================
*/public class LinkedList2{
    public static class Node{
   int data;
   Node next;
Node(int data){
this.data=data;
} 
}
public static void display(Node head){
while(head!=null){            
System.out.print(head.data+ "   ");
head=head.next;
}
}

public static void display2(Node head){
while(head.next!=null){            
System.out.print(head.data+ "   ");
head=head.next;
}
}
public static void DisplayR(Node head){
    if(head==null)
        return;
    System.out.print(head.data+"   ");
    DisplayR(head.next);
}

public static void Displayrev(Node head){
if(head==null)
    return;
Displayrev(head.next);
System.out.print(head.data+"   ");

}
public static void main(String[] args) {
    Node a=new Node(10);
    Node b=new Node(20);
    Node c=new Node(30);
    Node d=new Node(40);
    Node e=new Node(50);
a.next=b;
b.next=c;
c.next=d;
d.next=e;
display(a);
System.out.println();
System.out.println("=================");
DisplayR(a);
System.out.println();
System.out.println("=================");
Displayrev(a);
System.out.println();
System.out.println("=================");
display2(a);
}
}