package linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList mylinkedList=new LinkedList(10);
        mylinkedList.append(20);

        mylinkedList.getHead();
        mylinkedList.getTail();
        mylinkedList.getLength();

        System.out.println("priniting linked list");

        mylinkedList.printList();

       // System.out.println("remove last item");
        //System.out.println( mylinkedList.removeLast().value);

       // System.out.println( mylinkedList.removeLast().value);
       // System.out.println(mylinkedList.removeLast());
        System.out.println("linked list after prepend");
        mylinkedList.prepend(05);
        mylinkedList.printList();
        mylinkedList.prepend(0);
        System.out.println("linked list after prepend again");
        mylinkedList.printList();









    }
}
