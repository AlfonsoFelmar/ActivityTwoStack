package activitytwo;

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
            System.out.println("You're stack is full");
        }
    }
    
    // remove sa duplicates HOW
    public void removeDuplicates(){

    }
    
    // count all stack elements doesnt work well
    // works well na just add + 1 to top and put in a variable so easy?
    // why take so long???
    public void countElements(){
  
        if (!isEmpty()) {
            int sum = top + 1;
            System.out.println("Elements in stack: " + sum);
        }
        else {
            System.out.println("Stack is empty!");

            
        }
    }
    
    
    // see bottom element works
    public double  bottomElement(){
        if (!isEmpty()) {
            return StackArray[0];
            
        }
        else {
            System.out.println("Stack is Empty"
            + ", so you can't see the bottom.");
            return -1;
         
        }
        
    }
    
    // add stack to another stack HOW TF?
    public void stackStack(){
        
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
            for (int i = 0; i <= top; i++) {
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
            System.out.println("Stack is Empty"
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
            System.out.println("Stack is Empty"
                    + ", so you can't peek anything.");
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
