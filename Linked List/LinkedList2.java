public class LinkedList2 {

    Node head, tail;


    static class Node{
        int data;
        Node prev, next;

        Node(int data){
            this.data = data;
        }
    }

    void addFirst(int data){
        Node newNode = new Node(data);

        //if List is empty

        if(head == null){
            head= tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;

        head = newNode;
    }


    void addLast(int data){
        Node newNode = new Node(data);

        if(tail == null){
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;

    }

    void delete(int key){
        // Empty List
        if(head == null){
            return;
        }

        Node curr = head;

        //find Node;

        while(curr!= null && curr.data != key){
            curr = curr.next;

        }

        //value not found
        if(curr == null) return;

        //if tail  
        if(curr == tail){
            tail = tail.prev;
            tail.next = null;
            return;
        }

        //middle
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }

    void printForward(){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data+ "-> ");
            curr= curr.next;
        }
    }

    void printReverse(){
        Node curr = tail;
        while(curr!= null){
            System.out.print(curr.data+ "-> ");
            curr = curr.prev;
        }
    }


    public static void main(String[] args){
        LinkedList2 LL2= new LinkedList2();

        LL2.addFirst(30);
        LL2.addFirst(20);
        LL2.addFirst(10);
        LL2.addLast(40);
        LL2.printForward();
         System.out.println();
        System.out.println("---------------------------");
        LL2.printReverse();


    }
    
}
