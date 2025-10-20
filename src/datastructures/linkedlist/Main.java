package datastructures.linkedlist;

public class Main {
    public static void main(String[] args)
    {
        LinkedList myLinkedList = new LinkedList(5);
        myLinkedList.append(4);
        myLinkedList.append(34);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        System.out.println("Last value removed:"+myLinkedList.removeLast().value);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        myLinkedList.prePend(1371);
        myLinkedList.printList();
        //System.out.println("val"+myLinkedList.removeFirst().value);
        System.out.println("Value at index 1 is "+myLinkedList.get(1).value);
        myLinkedList.set(1,4150);
        seperator();
        myLinkedList.printList();
        myLinkedList.insert(1,36140);
        seperator();
        myLinkedList.printList();
        myLinkedList.remove(1);
        seperator();
        myLinkedList.printList();
        myLinkedList.reverse();
        seperator();
        myLinkedList.printList();
    }

    public static void seperator()
    {
        System.out.println("----------------------------------");
    }
}
