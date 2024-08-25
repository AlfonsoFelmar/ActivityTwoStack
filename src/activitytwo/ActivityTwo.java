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
            
            System.out.println("\nExit (0): ");
            System.out.println("Push an element input (1)");
            System.out.println("Pop an element input (2)");
            System.out.println("Peek stack input (3)");
            System.out.println("Peek at bottom stack input (4)");
            System.out.println("Loop through stack input (5)");
            System.out.println("Remove all duplicates input (6)");
            System.out.println("Count all elements (7)");
            System.out.println("Add stack to another stack (8)");
            System.out.println("Peek other stack (9)");
            System.out.println("Input: ");
            int choice = scn.nextInt();
            
            switch (choice) {
                case 0:
                    System.out.println("GOD BLESS SIR MAO!");
                    condition = true;   
                    break;
                case 1:
                    System.out.println("\nPush data to Stack: ");
                    // e while loop diri para mo loop ra siya permi
                    // para mag add og elements until mo stop na ang user
                    // problem if you add to many values how does our back end
                    // handle it ?????AsdASD?ASDASFasdf/lajsd
                    double push = scn.nextDouble();
                    classOneStack.push(push);
                    break;
                case 2:
                    System.out.println("\nPopped this element: " 
                            + classOneStack.pop());
                    break;
                case 3:
                    System.out.println("\nPeeked at the top: " 
                            + classOneStack.peek());
                    break;
                case 4:
                    System.out.println("\nPeeked at the bottom: "
                            + "" + classOneStack.bottomElement());
                    break;
                case 5:
                    classOneStack.loopStack();
                    break;
                case 6:
                    classOneStack.removeDuplicates();
                    break;
                case 7:
                    classOneStack.countElements();
                    break;
                case 8:
                    classOneStack.stackStack();
                    break;
                case 9:
                    classOneStack.loopNewStack();
                    break;
                default:
                    System.out.println("Can you read?\n");
                    condition = false;
                    break;
            }
            

            
     
        }
        
        
        
        
    }
    
}
