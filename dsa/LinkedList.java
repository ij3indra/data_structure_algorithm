package dsa;

class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

    private void display() {

        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }

    }

    // pushing the element at the head of the linked list
    private void push(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    // pushing the element at the specific position
    private void pushAtSpecfic(Node insertAfter, int data) {
        Node newNode = new Node(data);
        newNode.next = insertAfter.next;
        insertAfter.next = newNode;

    }

    // pushing the element at the end of the linked list
    private void pushAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = new Node(data);
            return;
        }

        newNode.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    public static void main(String aaa[]) {

        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;

        linkedList.display();

        linkedList.push(0);
        System.out.println("After pushing new element to head");
        linkedList.display();

        linkedList.pushAtSpecfic(linkedList.head.next, 8);
        System.out.println("After pushing new element after specific");
        linkedList.display();

        linkedList.pushAtEnd(10);
        System.out.println("After pushing new element at the end");
        linkedList.display();

    }

}