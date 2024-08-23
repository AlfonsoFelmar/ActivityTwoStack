package activitytwo;

import java.util.Scanner;

/**
 *
 * @author felmaralfonso
 */
public class ActivityTwo {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int stacksize;
        boolean condition = false;
        
        System.out.println("Set size of Stack: ");
        stacksize = scn.nextInt();
        
        ActivityTwoClassOne classOneStack = new ActivityTwoClassOne(stacksize);
        
        System.out.println("Current size of Stack is: " + stacksize);
        
        
        while(!condition) {
            
            System.out.println("\nPush an element input (1)");
            System.out.println("Pop an element input (2)");
            System.out.println("Peek stack input (3)");
            System.out.println("Loop through stack input (4)");
            System.out.println("Input: ");
            int choice = scn.nextInt();
            
            
            if (choice == 1) {
                System.out.println("\nPush data to Stack: ");
                double push = scn.nextDouble();
                classOneStack.push(push);
            }
            else if (choice == 2) {
                System.out.println("\nPopped this element: " + classOneStack.pop() + "\n");
                
            }
            else if (choice == 3) {
                System.out.println("\nPeeked at the top: " + classOneStack.peek()+ "\n" );
                
            }
            else if (choice == 4) {
                classOneStack.loopStack();
                    
            }
            else {
                System.out.println("Can you read?" + "\n");
                condition = false;
            }
            

            
     
        }
        
        
    }
    
}
