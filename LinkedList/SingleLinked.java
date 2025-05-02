class Node {
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;

    void add(int index , int data){
        Node n = new Node(data);
        if (index == 0) {
            addFirst(data);
        }else{
            Node curr = head;
            int count = 0;
            while (count < index -1) {
                count ++;
                curr = curr.next;
            }
            n.next = curr.next;
            curr.next = n; 
        }
    }

    void addFirst(int data){
        Node n = new Node(data);
        if (head == null) {
            head = n;
        }
        else{
        //   Node temp =  head.next;
        //   head = n;
        //   head.next = temp;
            n.next = head;
            head = n;
        }
    }

    void add(int data){

        Node p = new Node(data);

        if(head == null){
            head = p;
         }else{
            Node curr = head;
            while (curr.next !=null) {
                curr = curr.next;
            }
            curr.next = p;
         }
    }

    void addAll(int[] elements){
        for (int element : elements) {
            add(element);
        }
    }

    void removeFirst(){
        if (head == null) { //  no elements
            
        }else if (head.next == null) { // only one element present
            head = null;
        }else if(head.next != null){  // More than one element present

            Node curr = head;
            head = curr.next;
            curr = null;
        }
    }

    void removeLast(){
        Node curr = head;
        if (head == null) {
            
        }else if (head.next == null) {
            head = null;
        }else if (head.next !=null) {

            while (curr.next.next !=null) {
                curr = curr.next;
            }
            curr.next = null;
        }
    }

    int indexOf(int element){

        Node curr = head;
       
            int count = 0;
          while (curr != null) {

            if (curr.data == element) {
                return count;
            }
            curr = curr.next;
            count++;
          }

        
        return -1;
    }

    int lastIndexOf(int element){
        int index = -1;
        int count = 0;

        Node curr = head;

        while (curr !=null) {
            if (curr.data == element) {
                index = count;
            }
            curr = curr.next;
            count++;
        }

        return index;
    }

    int size(){
        int count =0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        return count;
    }

    void print(){
        Node curr = head;
        while (curr !=null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

}

public class SingleLinked {
public static void main(String[] args) {
    
    // Node n1 = new Node(10);
    // Node n2 = new Node(20);
    // Node n3 = new Node(30);

    // n1.next = n2;
    // n2.next = n3;
    LinkedList ll = new LinkedList();
    ll.add(10);
    ll.add(20);
    ll.add(30);

    ll.addFirst(5);

    ll.add(2,60);

    int arr[] = {10,1,2,3,4,};

    ll.addAll(arr);
    
    ll.removeFirst();

    ll.removeLast();
    

    System.out.println("The index of 33 is : " + ll.indexOf(33));
    System.out.println("The last index  of 10 is  : " + ll .lastIndexOf(10));
    System.out.println("The size of linked list is :" + ll.size());
    ll.print();
}
    
}