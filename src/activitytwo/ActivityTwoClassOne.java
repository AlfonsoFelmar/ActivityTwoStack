package activitytwo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author felmaralfonso
 */
public class ActivityTwoClassOne {
    
    private int Size;
    private double[] StackArray;
    private int top;
    
    
    // constructor
    public ActivityTwoClassOne(int Size){
        this.Size = Size;
        StackArray = new double[this.Size];
        top = -1;
    }
    
    
    // inputs value in stack 
    // this is a setter mao ni siya mag add sa atong values sa stack array
    public void push(double number){
        if (!isFull()) {
           StackArray[++top] = number;
        } else {
            System.out.println("\nYou're stack is full");
        }
    }
        
    // remove sa duplicates HOW
    // MY GHAD NI WORK
    // SO SAME SYSTEM RA ATONG SA NEETCODES PAG DETECT SA DUPLICATES THEN
    // NAG CREATE TAG NEW VARIABLE CALLED newTop para e add sa atong stack
    // array then e equal nato ang new top nato sa atong old top then mo work 
    // na siya WOWOWOWOWO MAGIC
    public void removeDuplicates(){
        Set<Double> uniques = new HashSet<>();
        int newTop = -1;
        boolean hasDuplicate = false;
        for (int i = 0; i <= top; i++) {
            if (uniques.contains(StackArray[i])){
                System.out.println("\nDuplicate Detected! " + StackArray[i]);
                StackArray[++newTop] = StackArray[i];
                top = newTop;        
                hasDuplicate = true;
            }
            uniques.add(StackArray[i]);
        }
        if(hasDuplicate == false){
            System.out.println("\nNo Duplicate Detected!");
        }
        
    }
    
    
    // add stack to another stack HOW TF?
    public void stackStack(){
        
    }
    
    
    // count all stack elements doesnt work well
    // works well na just add + 1 to top and put in a variable so easy?
    // why take so long???
    public void countElements(){
  
        if (!isEmpty()) {
            int sum = top + 1;
            System.out.println("\nElements in stack: " + sum);
        }
        else {
            System.out.println("\nStack is empty!");

            
        }
    }
    
    // loop sa stack doesnt work well
    // mo work well na siya after top atong gi condition
    // rather than Size kay if size mo loop siya apil sa 0.0 values
    public void loopStack(){
        if (isEmpty()) {
            System.out.println("Stack is empty! ");
        }
        else {
            System.out.println("\nStack:");
            
            //int i = 0; i <= top; i++
            // since baliktad if kanang naa sa taas gamiton
            // 
            for (int i = top; i >= 0; i-- ) {
            System.out.println(StackArray[i]);           
        }
        }

    }
        
    // pops an element WORKing
    public double pop(){
        if (!isEmpty()) {
            return StackArray[top--];
        }
        
        else {
            System.out.println("\nStack is Empty"
                    + ", input values first.");
            return -1;          
        }
    
    }
    
    // peeks at the top WORKING
    public double peek(){
        if (!isEmpty()) {
            return StackArray[top];
        }
        else {
            System.out.println("\nStack is Empty"
                    + ", so you can't peek anything.");
            return -1;
        }
    }
    
        // see bottom element works
    public double  bottomElement(){
        if (!isEmpty()) {
            return StackArray[0];
            
        }
        else {
            System.out.println("\nStack is Empty"
            + ", so you can't see the bottom.");
            return -1;
         
        }
        
    }
    
    // checks if empty WORKing
    public boolean isEmpty(){
         return (top == -1);
    }
    
    // checks if fullWORKing
    public boolean isFull(){
        return (top == Size -1);
    }
        
    
}
