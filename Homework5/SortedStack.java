/**
 * Importing Java utilities imports Java's Collections Framework which
 * contains the Scanner, Stack, and ListIterator objects we use in this program
 */

 import java.util.*;

 /**
  * The SortedStack class reads integer input from the user,
  * inserts them into a Stack in sorted order, and displays the sorted stack.
  * If users enter anything other than an integer, or they enter a very large number, 
  * an error will display prompting users to only use integers
  */
 
 public class SortedStack {
 
     /**
      * The main method reads input from the user, stores the numbers in order
      * in a stack using the insertSorted method, and displays the sorted stack.
      *
      * @param args -- User inputs to the command line
      */
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Stack<Integer> numbers = new Stack<>();
         
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
         
         System.out.println("Sorted Stack: " + numbers);
     }
     
     /**
      * Inserts a given integer into the Stack while maintaining sorted order.
      * insertSorted temporarily pops elements from the stack until the correct
      * position is found, then re-pushes the elements back in order.
      *
      * @param stack The stack to insert the number into.
      * @param value The integer value to be inserted in sorted order.
      */
 
     private static void insertSorted(Stack<Integer> stack, int value) {
         Stack<Integer> tempStack = new Stack<>();
         
         while (!stack.isEmpty() && stack.peek() > value) {
             tempStack.push(stack.pop());
         }
         
         stack.push(value);
         
         while (!tempStack.isEmpty()) {
             stack.push(tempStack.pop());
         }
     }
 }
 