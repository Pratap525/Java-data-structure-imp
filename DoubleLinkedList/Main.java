class Node {
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoubleLinkedList{
    Node head;
    Node tail;

    void add(int element){
        Node temp = new Node(element);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    void addFirst(int element){
        Node temp = new Node(element);
        if (head == null) {
            head = temp;
            tail = temp;
        }else{
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
    }
    void add(int index , int element){
        Node temp = new Node(element);
        Node curr = head;
        int count = 0;
        if(index == 0){
            addFirst(element);
        }else{
            while (count < index -1) {
                curr = curr.next;
                count++;
            }
            curr.next.prev = temp;
            temp.next = curr.next;
            curr.next = temp;
            temp.prev = curr;
        }
    }

    void addAll(int []elements){
        for (int element : elements) {
            add(element);
        }
    }
    void print(){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void printReverse(){
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.prev;   
        }
        System.out.println();
    }
}


public class Main {

    public static void main(String[] args) {
        
    DoubleLinkedList ll = new DoubleLinkedList();
    
    ll.add(20);
    ll.add(30);
    ll.add(40);
    ll.add(80);

    System.out.println("The head of linked list : " + ll.head.data);
    System.out.println("THe tail of linked list : " + ll.tail.data);
    System.out.println("The elements are ");
    ll.print();
    System.out.println("Printing elemets in reverse order");
    ll.printReverse();
    System.out.println();
    ll.addFirst(10);
    ll.print();
    ll.printReverse();  
    ll.addFirst(100);
    ll.print();

    ll.add(3, 800);
    ll.print();
    ll.printReverse();
    int arr[] = {0,9,8};
    ll.addAll(arr);

    ll.print();
    }
}