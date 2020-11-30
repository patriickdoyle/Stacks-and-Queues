/* StringStack.java
CSCI 211
Prof. Herbert
Last Edited by Pat Doyle 6/20/20
This class is an array based stack class with push() and pop() methods
 */

package Stack;

public class StringStack {

    //2 properties: an array of objects and a stack pointer to the top of the stack
    String stackArray[] = new String[7];
    int top = -1;

    //push() method adds an item to the top of the stack
    void push(String item)
    {
        //proceed only if the stack isnt full
        if(top < ((stackArray.length) - 1))
        {
            //push item onto the stack
            stackArray[top + 1] = item;
            //increment stack pointer
            top++;
        } //end if

        else
        {
            System.out.println("Stack full.");
        }
    } //end push()

    //pop() method removes an item from the top of the stack
    String pop()
    {
        //item to be returned by pop method
        String item;
        //only proceed if the stack isnt empty
        if(top >= 0)
        {
            item = stackArray[top]; //set the item to the top of the stack
            top--; //increment stack pointer
        }//end if
        else
        {
            System.out.println("Stack is empty");
            item = null;
        }//end else
        //return item to be popped
        return item;
    }//end pop()
}//end StringStack.java
