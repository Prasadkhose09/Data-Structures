package Queue;

public class LinkedListQueue {
    static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    Node rear, front;
    int size;

    void enqueue(int val){
        Node node = new Node(val);
        if(rear == null) front = rear = node;
        else{
            rear.next =node;
            rear = node;
        }
        size++;
    }

    int dequeue(){
        if(isEmpty()) throw  new RuntimeException("Empty Queue!");
        int data = front.val;
        front = front.next;
        if(front == null) rear = null;
        size--;
        return data;
    }

    boolean isEmpty(){return size==0;}
    int peek(){ return front.val;}

    public static void main(String[] args){
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
    }
    
}
