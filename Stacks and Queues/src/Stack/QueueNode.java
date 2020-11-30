/* QueueNode.java
CSCI 211
Prof. Herbert
This class contains attributes and methods for the nodes used in a queue
Last edited by Pat Doyle 7/6/20
 */

package Stack;

public class QueueNode
{
        //creates String variable to store data
        String data;

        //creates node to link to the next item in the queue
        QueueNode next;

        //null constructor method
        public QueueNode()
        {

        }//end QueueNode()

        //method creates a node with data as parameters
        public QueueNode(String data){
            this.data = data;
        }//end QueueNode(String data)

        //method creates a node with data and next as parameters
        public QueueNode(String data, QueueNode next){
            this.data = data;
            this.next = next;
        }//end QueueNode(String data, QueueNode next)

        //get and set methods for 'data' attribute
        public String getData() {
            return data;
        } //end getData()

        public void setData(String data) {
            this.data = data;
        }//end setData(String data)

        //get and set methods for 'next' attribute
        public QueueNode getNext() {
            return next;
        }//end getNext()

        public void setNext(QueueNode next) {
            this.next = next;
        }//end setNext(QueueNode next)

}//end QueueNode

