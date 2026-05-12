package Stack;

import javax.management.RuntimeErrorException;

class StackUsingArray{

    int[] arr;
    int size;
    int top=-1;

    StackUsingArray(int size){
        this.size = size;
        arr = new int[size];
    }

    //isEmpty

    boolean isEmpty(){
        return top == -1;
    }

    //Size

    int size() {return top+1;}

    //Push
    void push(int data){
        if(top == size-1){
            throw new RuntimeException("Stack Overfloq");
        }
        arr[++top] = data;
    }

    //Pop
    int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack Empty");
        }
        return arr[top--];
    }

    //Peek
    int peek(){
        if(isEmpty()) throw new RuntimeException("Stack Empty");

        return arr[top];
    }


    public static void main(String[] args){
        StackUsingArray stack = new StackUsingArray(15);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());

    }


}