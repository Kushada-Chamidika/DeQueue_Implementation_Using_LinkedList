package dsa_assignment_04;

/**
 *
 * @author 1999k
 */
public class TestClassForLinkedListImplementation {

    public static void main(String[] args) {

        dequeUsingLinkedList dq = new dequeUsingLinkedList();

        System.out.println("");
        System.out.println("Insert element at Front end  : 1 ");
        dq.pushFront(1);
        System.out.println("Insert element at Front end  : 2 ");
        dq.pushFront(2);
        System.out.println("Insert element at Front end  : 3 ");
        dq.pushFront(3);

        System.out.println("");
        System.out.println("Insert element at Rear end  : 10 ");
        dq.pushBack(10);
        System.out.println("Insert element at Rear end  : 9 ");
        dq.pushBack(9);
        System.out.println("Insert element at Rear end  : 8 ");
        dq.pushBack(8);

        System.out.println("");
        System.out.println("Print Deque : ");
        dq.executeDeque();

        System.out.println("");
        System.out.println("Remove element from back end  :  " + dq.popBack());

        System.out.println("");
        System.out.println("Print Deque : ");
        dq.executeDeque();

        System.out.println("");
        System.out.println("Remove element from front end  :  " + dq.popFront());

        System.out.println("");
        System.out.println("Print Deque : ");
        dq.executeDeque();

        System.out.println("");
        System.out.println("Get element from front end  :  " + dq.getFront());

        System.out.println("");
        System.out.println("Print Deque : ");
        dq.executeDeque();

        System.out.println("");
        System.out.println("Get element from back end  :  " + dq.getBack());

        System.out.println("");
        System.out.println("Print Deque : ");
        dq.executeDeque();

        System.out.println("");
        System.out.println("Size of Deque  :  " + dq.size());

        System.out.println("");
        System.out.println("Check isEmpty : " + dq.isEmpty());

    }

}
