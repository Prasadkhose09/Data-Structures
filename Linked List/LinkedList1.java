public class LinkedList1 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;

        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    void delete(int data){
        if(head == null) return;

        if(head.data == data){
            head = head.next;
            return;
        }

        Node curr = head;
            while(curr.next != null){
                if(curr.next.data == data){
                    curr.next = curr.next.next;
                    return;
                }
                curr= curr.next;
            }
    }

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-> ");

            curr = curr.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList1 SLL = new LinkedList1();

        SLL.addFirst(10);
        SLL.addFirst(20);
        SLL.addLast(5);
        SLL.delete(10);

        SLL.print();

    }

}
