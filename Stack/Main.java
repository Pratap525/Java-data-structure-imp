import java.util.ArrayList;

class Stack{
    
    ArrayList<Integer> al;
    int top;
    
    Stack(){
        al  = new ArrayList<>();
        top = -1;
    }

    void push(int element){
        al.add(element);
    }

    int pop(){
        int num = al.get(al.size()-1);
        al.remove(al.size()-1);
        return num;

    }
}

public class Main {

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