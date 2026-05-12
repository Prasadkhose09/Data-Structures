package Stack;

public class LinkedListStack {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top = null;
    int size = 0;

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    // Peek
    int peek() {
        return top.data;
    }

    // Push
    void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
        size++;
    }

    // Pop
    int pop() {
        if (isEmpty())
            throw new RuntimeException("Empty!");

        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

     public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

<<<<<<< HEAD
        System.out.println(stack.peek()); 

        System.out.println(stack.pop());
        System.out.println(stack.pop()); 

        System.out.println(stack.size()); 
=======
        System.out.println(stack.peek()); // 30

        System.out.println(stack.pop()); // 30
        System.out.println(stack.pop()); // 20

        System.out.println(stack.size()); // 1
>>>>>>> f7baf3f8acd4c75b28200fef18adf6f04a6967e8
    }

}
