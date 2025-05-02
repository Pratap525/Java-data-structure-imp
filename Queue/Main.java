  class Queue{
    int front;
    int rear;
    int size;
    int capacity;
    int[] arr;

    Queue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int ele){
        // / case 1 : array is  full

        if(rear == capacity -1){
            System.out.println("Queue is full  unable to add element");

        // case 2 : array is not full

        }else{
            // rear++;
            // arr[rear] = ele;
            // size++;
        

            arr[++rear] = ele;
            size++;
        }
    }

    int dequeue(){
        // case 1 : array is empty
        if(rear <front){
            System.out.println("Array is empty");
            return -1;
        }else{
                // case 2  :array is not empty

               int ele =   arr[front] ;
                front++;
                size--;
                return ele;
        }
    }


    int getFront(){
        if(size > 0){
            return arr[front];
        }else{
            System.out.println("Queue is empty");
            return -1;
        }
    }

    int getRear(){
        if (size > 0) {
            return arr[rear];
        }else{
            System.out.println("Queue is empty");
        }
        return -1;
    }

    boolean isEmpty(){
        if(size ==0){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if (rear == capacity-1) {
            return true;
        }
        return false;
    }
    void print(){
        for (int i  =front ;i<=rear;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


public class Main {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println(q.isEmpty());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(60);

        q.print();

       System.out.println( q.dequeue());
       System.out.println( q.dequeue());
    //    System.out.println( q.dequeue());
    //    System.out.println( q.dequeue());
    //    System.out.println( q.dequeue());
    //    System.out.println( q.dequeue());
        q.print();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.print();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.enqueue(70);
    }
}
