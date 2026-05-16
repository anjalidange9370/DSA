public class Implementation {

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // LinkedList class
    public static class LinkedList {

        Node head = null;
        Node tail = null;
        int size = 0;
        void InsertAtEnd(int val) {

            Node temp = new Node(val);

            // if list is empty
            if (head == null) {
                head = temp;
                tail = temp;
            }

            // if list already has nodes
            else {
                tail.next = temp;
                tail = temp;
            }

            // increase size
            size++;
        }

        // Insert at head
        void InsertAtHead(int val) {

            Node temp = new Node(val);

            // if list is empty
            if (head == null) {
                InsertAtEnd(val);
            }

            // insert before head
            else {
                temp.next = head;
                head = temp;

                // increase size
                size++;
            }
        }

        // Insert at index
        void InsertAt(int idx, int val) {

            // if inserting at end
            if (idx == size) {
                InsertAtEnd(val);
                return;
            }

            // if inserting at head
            if (idx == 0) {
                InsertAtHead(val);
                return;
            }


            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
                        t.next = temp.next;
            temp.next = t;
            }
            size++;
        }


        int getAt(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        // function to return size
        int size() {
            return size;
        }

        
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
            // display size also
            System.out.println("Size = " + size);
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtHead(5);
        list.InsertAt(2, 15);
        list.display();
        System.out.println("Element at index 2 = " + list.getAt(2));
        System.out.println("Total Size = " + list.size());
    }
}