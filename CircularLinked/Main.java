class Node {
    int data;
    Node next;

    Node(int data){
        this.data  = data;
        this.next = null ;
    }

}

class CircularLinkedList{
    Node head;

    void print(){
        if(head == null){

        }else{
            Node curr = head;
            do {
                System.out.print(curr.data + " ");
                curr = curr.next;
            } while (curr != head);
        }
        System.out.println();
    }
     
    //  Take o(n) --> for adding

    // void addFirst(int data){
    //     Node temp = new Node(data);
    //     if(head == null){
    //         head = temp;
    //         head.next = head;
    //     }else{
    //         Node curr = head.next;
    //         while (curr.next != head) {
    //             curr = curr.next;
    //         }
    //         curr.next = temp;
    //         temp.next = head;
    //         head = temp;
    //     }
    // }



    /// ----> takes o(1)  for adding by adding and swap as second element
    
    void addFirst(int data){
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            head.next = head;
        }else{
            // Node curr = head.next;
            temp.next = head.next;
            head.next = temp;
            int temp1 = head.data;
            head.data = temp.data;
            temp.data = temp1;


        }
    }


    void addLast(int data){
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            head.next = head;
        }else{
            Node curr =head.next;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
    }

  void  addLastEfff(int data){

        Node temp = new Node(data);

        if (head == null) {

            head = temp;
            head.next = head;

        }else{

            temp.next = head.next;
            head.next = temp;
            int temp1 = head.data;
            head.data = temp.data;
            temp.data = temp1;

            head = head.next;

        }
    }

    void removeFirst(){
        if(head == null){ }

        else if(head.next == head){
            head = null;
        } 
        else{
            Node curr = head.next;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = head.next;
            head = head.next;
        }       
    }

    void removeFirstEff(){
        if (head == null) {
            
        }else if (head.next == head) {
            head = null;
        }else{
            Node curr = head.next;
            int temp = head.data;
            head.data = curr.data;
            curr.data = temp;

            head.next = curr.next;

        }
    }
}

public class Main {
public static void main(String[] args) {
    CircularLinkedList ll = new CircularLinkedList();
    Node n0 = new Node(10);
    Node n1 = new Node(20);
    Node n2 = new Node(30);
    Node n3 = new Node(40);

    n0.next = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n0;
    
    ll.head = n0;
   
    ll.print();

    ll.addFirst(80);
    ll.print();

    ll.addFirst(4);
    ll.print();

    ll.addLast(0);
    ll.print();

    ll.addLastEfff(22);
    ll.print();

    ll.removeFirst();
    ll.print();

    ll.removeFirstEff();
    ll.print();
}
    
}