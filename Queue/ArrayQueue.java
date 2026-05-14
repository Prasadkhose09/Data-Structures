package Queue;

public class ArrayQueue {
    int[] arr;
    int front =0, rear =-1, size=0, cap;

    ArrayQueue(int cap){
        this.cap = cap;
        arr= new int[cap];
    }

    void enqueue(int val){
        if(size == cap ) throw new RuntimeException("Queue Full !");
        rear = (rear +1) %cap; // Makes it circular queue for simple just rear++;
        arr[rear] = val;
        size++;
    }

    int dequeue(){
        if(size ==0) throw new RuntimeException("Queue Empty !");
        int val = arr[front];
        front =( front +1 )%cap;  // for simple only front++,
        size--;
        return val;
    }

    int peek(){return arr[front];}
    int size(){return size;}
    boolean isEmpty(){return size==0;}


    public static void main(String[] args){
        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.size());
        System.out.println( queue.peek());
    }

    
}
