package dsa_assignment_04;

import java.util.LinkedList;

/**
 *
 * @author 1999k
 */
public class dequeUsingLinkedList {

    LinkedList<Integer> list = new LinkedList<>();

    // Function to push an element at rear end of Deque.
    public void pushBack(int data) {
        list.addLast(data);
    }

    // Function to push an element at front of Deque.
    public void pushFront(int data) {
        list.addFirst(data);
    }

    // Function to pop an element at rear end of Deque.
    public int popBack() {
        return list.removeLast();
    }

    // Function to pop an element at front end of Deque.
    public int popFront() {
        return list.removeFirst();
    }

    // Function to get rear element of Deque.
    public int getBack() {
        return list.getLast();
    }

    // Function to get front element of Deque.
    public int getFront() {
        return list.getFirst();
    }

    // Function to get size of Deque.
    public int size() {
        return list.size();
    }

    // Function to checks whether Deque is empty or not.
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Function to print all elements in the Deque.
    public void executeDeque() {
        for (int i = 0; i < list.size(); i++) {
            Integer value = list.get(i);
            System.out.println("Value " + i + " : " + value);
        }
    }

}
