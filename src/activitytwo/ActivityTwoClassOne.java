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
    
    public void loopStack(){
        for (int i = 0; i < Size; i++) {
            System.out.println(StackArray[i]);           
        }
    }
        
    // pops an element
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
    
    // peeks at the top
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
    
    // checks if empty
    public boolean isEmpty(){
         return (top == -1);
    }
    
    // checks if full
    public boolean isFull(){
        return (top == Size -1);
    }
        
    
}
