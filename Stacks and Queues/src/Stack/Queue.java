/* Queue.java
CSCI 211
Prof. Herbert
This class can be used to store data in a queue
Last edited by Pat Doyle 7/6/20
 */
package Stack;

public class Queue {

    //properties include a head and tail pointer as well as a
    //counter to keep track of how many objects are in the queue
    private QueueNode head;
    private QueueNode tail;
    private int count = 0; //count set to zero before anything is added to queue

    //get and set methods for the properties
    public QueueNode getHead() {
        return head;
    }//end getHead()

    public void setHead(QueueNode head) {
        this.head = head;
    }//end setHead()

    public QueueNode getTail() {
        return tail;
    }//end getTail()

    public void setTail(QueueNode tail) {
        this.tail = tail;
    }//end setTail()

    public int getCount() {
        return count;
    }//end getCount()

    public void setCount(int count) {
        this.count = count;
    }//end setCount()

    //enqueue(String) takes a String value and adds it to the tail
    //of the queue
    public void enqueue(QueueNode newNode)
    {
        //create QueueNode object to keep track of current node
        QueueNode current = newNode;

        //if tail is empty, set data to tail and head
        if (tail == null)
        {
            head = tail = current;

            //increment count
            count = count + 1;
        }

        //if tail has a node, set the tail to the next node
        //then set current to that node
        else
        {

            tail.next = current;
            tail = current;

            //increment count
            count = count + 1;
        }
    }//end enqueue()

    //dequeue(String) removes a String value from the head of the queue
    public void dequeue() throws Exception
    {
        //set head to the next element in the queue
        head = head.next;

        if (head == null)
        {
            tail = null;
        }

        //decrement count
        count = count - 1;

    }//end dequeue

    //printQueue() prints the queue (duh)
    public void printQueue()
    {
        //create QueueNode object to keep track of
        //current node
        QueueNode current = head;

        //print the data in the current node until the queue is empty
        while(current != null)
        {
            System.out.println(current.data + " ");

            //set current to the next element each iteration
            current = current.next;
        }//end while
    }//end printQueue

    //isEmpty() returns true or false depending on whether the queue is
    //empty
    public boolean isEmpty()
    {
        //create boolean variable to return
        boolean empty;

        //empty returns as true if there is no tail
        //or false if there is a tail
        if (tail == null)
        {
            empty = true;
        }

        else
        {
            empty = false;
        }

        return empty;
    }//end isEmpty()

    //search(String) searches the queue for a String and returns true or
    //false depending on whether it is in the queue
    public boolean search(String data)
    {
        //create boolean object to return true of false
        //if searched term is found
        boolean result = false;

        //create QueueNode object to keept track of current
        //node. Set it to the head and iterate the Queue
        QueueNode current;
        current = head;

        //while loop iterates Queue until the current node
        //is null
        while(current != null)
        {
            //boolean object is set to true if data is matched
            if (current.data == data)
            {
                result = true;
                break;
            }

            //set current to the next node each iteration
            //data isn't matched
            current = current.next;
        }//end while

        System.out.println(result);
        return result;

    }//end search()

}//end Queue.java
