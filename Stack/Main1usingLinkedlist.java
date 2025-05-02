class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    Node top;

    void push(int element){
        Node temp = new Node(element);
        if (top == null) {
            top = temp;
        }else{
            temp.next = top;
            top = temp;
        }
    }

    int pop(){
        if (top == null) {
            
        }
        else if(top.next == null){
            int data = top.data;
            top = null;
            return data;
        }
        else{
            int data = top.data;
            top = top.next;
            return data;
        }

        return -1;
    }
}
public class Main1usingLinkedlist {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
