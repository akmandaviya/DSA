package LinkedList;

class Node {
	public int data;
	public Node next;
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}
	
public class LL1 {
    private Node head;
    private Node tail;
    int size;
    
    public static void main (String [] args) {
    	LL1 list = new LL1();
    	list.addFirst(5);
    	list.addFirst(4);
    	list.addFirst(3);
    	list.addFirst(2);
    	list.addFirst(1);
    	
        list.display();
    }
    
    public void display() {
    	Node temp = this.head;
    	while(temp != null) {
    		System.out.print(temp.data + "->");
    		temp = temp.next;
    		
    	}
    	System.out.println("null");
    }
    
    public void addFirst(int data) {
    	Node n = new Node(data, null);
    	if(this.size == 0) {
    		this.tail = n;
    	}
    	n.next = this.head;
    	this.head = n;
    	this.size++;
    }
}
