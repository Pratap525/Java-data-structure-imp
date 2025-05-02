class Queue{
    int[] arr;
    int front;
    int rear ;
    int size;
    int capacity;

    Queue(int capacity){
        arr = new int[capacity];
        this.capacity = capacity;
        this.front =0;
        this.rear = -1;
        this.size = 0;
    }

    void enqueue(int ele){
        if (size == capacity) {
            System.out.println("Its is full");
        }
        else{
            rear = (rear+1) % capacity;
            arr[rear] = ele;
            size++;
        }
    }

    int dequeue(){
        if(size == 0){
            System.out.println("Its is already empty");
            return-1;
        }else{
            int temp = arr[front];
            front = (front+1) % capacity;
            size--;
            return temp;
        }
    }

    int getFront(){
        if (size >0) {
            return arr[front];
        }else{
            System.out.println("Its is empty");
            return-1;
        }
    }
    int getRear(){
        if (size >0) {
            return arr[rear];
        }else{
            System.out.println("Its is empty");
            return-1;
        }
    }

    boolean isEmpty(){
        return size ==0;
    }
    
    boolean isFull(){
        return size == capacity;
    }

    void print(){
        for (int i =0;i<capacity;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(0);
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.dequeue());
        System.out.println(q.getFront());
        q.enqueue(10);
        // q.print();
        System.out.println(q.getRear());
        q.print();
    }
}