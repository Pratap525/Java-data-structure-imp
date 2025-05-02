

class LinkedList{
    Node head;

    void print(Node start){
        Node curr = start;
        while (curr != null) {
            System.err.print(curr.data + " ->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    Node reversNode(Node start){
        if(start == null || start.next == null){
            return start;
        }
       Node Newhead = reversNode(start.next);
       start.next.next = start;
       start.next = null;

        return Newhead;
    }

    
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data =data;
        this.next = null;
    }
}

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(5);

        System.out.println("Original linked list :");
        ll.print(ll.head);

        System.out.println("Reverse linked list :");
        Node n1 =ll.reversNode(ll.head);
        ll.print(n1);
        
    }
}