import java.util.*;

public class Main {
	public static void main(String[] args) {
	
	    LinkedList list = new LinkedList();
	    int listSize = 13; //Wielkosc LinkedList
	    for(int i=1; i<=listSize; i++) {
	    	list.addElement(new LinkedList.Node(String.valueOf(i)));
	    }
	    
	    printMiddleElement(list);
	}

	private static void printMiddleElement(LinkedList linkedList) {

		LinkedList.Node slowPointer = linkedList.getHeaderElement();
		LinkedList.Node fastPointer = linkedList.getHeaderElement();

		if (linkedList != null) {

			while (fastPointer != null && fastPointer.next() != null) {
				fastPointer = fastPointer.next().next();
				slowPointer = slowPointer.next();
			}

			System.out.println("Middle element of linked list is " + slowPointer.value());

		}
	}
}

class LinkedList{
    private Node headerElement;
    private Node tailorElement;
  
    public LinkedList(){
        this.headerElement = new Node("HeaderElement");
        tailorElement = headerElement;
    }
  
    public Node getHeaderElement(){
        return headerElement;
    }
  
    public void addElement(Node node){
        tailorElement.next = node;
        tailorElement = node;
    }
  
    public static class Node{
        private Node next;
        private String value;
 
        public Node(String value){
            this.value = value;
        }
      
        public String value() {
            return value;
        }
 
        public Node next() {
            return next;
        }
      
        public String toString(){
            return this.value;
        }
    }
}