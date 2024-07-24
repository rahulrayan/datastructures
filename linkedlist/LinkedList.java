package linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {

        Node newnode = new Node(value);
        head = newnode;
        tail = newnode;
        length = 1;

    }

    public void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void getHead() {
        if (head == null) {
            System.out.println(" there is no item in linked list and there is no head");
        } else {
            System.out.println("Head :\t" + head.value);

        }

    }

    public void getTail() {
        if (tail == null) {
            System.out.println("there is no item in linked list and there is no tail");
        } else {
            System.out.println("Tail :\t" + tail.value);
        }

    }

    public void getLength() {
        if (length == 0) {
            System.out.println(" there is no item in linked list and lentgh is zero");
        }
        System.out.println("length :\t" + length);
    }

    public void append(int value) {
        Node newnode = new Node(value);
        if (length == 0) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
        length++;
    }

    public Node removeLast() {

        if (length == 0) return null;

        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {

            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {

        if (length == 0) {

            Node n1 = new Node(value);
            head = n1;
            tail = n1;
        } else {
            Node n1 = new Node(value);
            n1.next = head;
            head = n1;

        }
        length++;
    }


}

