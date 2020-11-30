/* Main.java
CSCI 211
Prof. Herbert
Last Edited by Pat Doyle 7/6/20
This class contains a main method that creates an array of cities
and calls methods from the StringStack class in order to reverse
the array of cities
 */

package Stack;

public class Main {

    public static void main(String[] args) throws Exception {
	// create String array that contains a list of cities
        String cities[] = {"Philadelphia, PA", "Harrisburg, PA", "Pittsburg, PA",
                "Cleveland, OH", "Toledo, OH", "Gary, IN", "Chicago, IL"};

        //instantiate a String stack
        StringStack stack = new StringStack();

        //print the original array of cities
        System.out.println("\n" + "Path of Cities from Philly to Chicago: ");

        for(int i = 0; i < cities.length; i++)
        {
            System.out.println("\n" + cities[i]);
        }//end for

        //iterate the original array, pushing each element into a stack
        for(int i = 0; i < cities.length; i++)
        {
            stack.push(cities[i]);
        }//end for

        //use a for loop to pop each city name from the stack
        //and put it back into the source array to reverse the order
        for(int i = 0; i < cities.length; i++)
        {
            cities[i] = stack.pop();
        }//end for

        //print each element in the reversed stack
        System.out.println("\n" + "Path of cities from Chicago to Philly: ");
        for(int i = 0; i < cities.length; i++)
        {
            System.out.println("\n" + cities[i]);
        }//end for

        //create Queue and QueueNode objects
        Queue stringQueue = new Queue();

        System.out.println("\n" + "Adding cities to a queue: ");

        //for loop sets the data in a node to a String in the
        //cities array, then enqueues the node
        for(int i = 0; i < cities.length; i++)
        {
            //enqueue each element from the array
            stringQueue.enqueue(new QueueNode(cities[i]));

            //print the data in the node and the count of the queue
            //for each iteration
            System.out.println("\n" + cities[i] + " is being added; count = " + stringQueue.getCount());
        }//end for loop

        System.out.println("\n" + "Removing cities from queue: ");

        //remove items from the queue until the queue is empty
        while(stringQueue.getTail() != null)
        {
            //create QueueNode object to keep track of current node
            QueueNode current = stringQueue.getHead();

            //dequeue the head of the queue with each iteration
            stringQueue.dequeue();

            //print the current node's data and the current count
            System.out.println("\n" + current.getData() + " is being removed. Count = " + stringQueue.getCount());

            //set the current node to the next element in the queue
            current = current.getNext();
        }

    }//end main method
}//end main class
