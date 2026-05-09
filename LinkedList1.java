public class LinkedList1{
    public static class Node{
        Node next;
        int data;
        Node(int data){
this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //1st way to print LinkedList
        System.out.print(a.data+"  ");
        System.out.print(b.data+"  ");
        System.out.print(c.data+"  ");
        System.out.print(d.data+"  ");
        System.out.print(e.data+"  ");
        System.out.println();
        System.out.println("=======================");
        //2nd way to print LinkedList
        System.out.print(a.data+"  ");
        System.out.print(a.next.data+"  ");
        System.out.print(a.next.next.data+"  ");
        System.out.print(a.next.next.next.data+"  ");
        System.out.print(a.next.next.next.next.data+"  ");
        System.out.println();
        System.out.println("==========================");
        //3rd way to print LinkedList
        Node temp=a;
        for(int i=1;i<=5;i++){
        System.out.print(temp.data+"  ");
        temp=temp.next;
         }
        System.out.println();
        System.out.println("==========================");
      //4th way to print LinkedList
      temp=a;
      while(temp!=null){
      System.out.print(temp.data+"  ");
      temp=temp.next;
         }
         }
         }