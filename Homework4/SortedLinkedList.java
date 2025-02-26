/**
 * Importing Java utilities imports Java's Collections Framework which
 * contains the Scanner, LinkedList and ListIterator objects we use in this program
 */

import java.util.*;

/**
 * The SortedLinkedList class reads integer input from the user,
 * inserts them into a LinkedList in sorted order, and displays the sorted list. 
 * If users enter anything other than an integer, or they enter a very large number, 
 * an error will display prompting users to only use integers
 */

public class SortedLinkedList {

    /**
     * The main method reads input from the user, stores the numbers in order
     * in a linked list using the insertSorted class, and displays the sorted 
     * linked list.
     *
     * @param args -- User inputs to the command line
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();
        
        System.out.println("Enter integers (type '***' to finish):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                insertSorted(numbers, num);
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("***")) {
                    break;
                } else {
                    System.out.println("Invalid input, please enter an integer or '***' to finish.");
                }
            }
        }
        scanner.close();
        
        System.out.println("Sorted List: " + numbers);
    }
    
    /**
     * Inserts a given integer into the LinkedList while maintaining sorted order.
     * insertSorted traverses the list until it finds an element greater than "value"
     * When it finally does, it backtracks one step and inserts value before the
     * larger number ahead of it.
     *
     * @param list  The linked list to insert the number into.
     * @param value The integer value to be inserted in sorted order.
     */

    private static void insertSorted(LinkedList<Integer> list, int value) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() > value) {
                iterator.previous();
                iterator.add(value);
                return;
            }
        }
        list.add(value);
    }
}
