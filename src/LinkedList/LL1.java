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
   
    //T.C => O(1)
    public void addFirst(int data) {
    	Node n = new Node(data, null);
    	if(this.size == 0) {
    		this.tail = n;
    	}
    	n.next = this.head;
    	this.head = n;
    	this.size++;
    }
    
    //T.C => O(1)
    public  void addLast(int data) { 
      Node n = new Node(data, null);
      if(this.size == 0 ) {
    	  addFirst(data);
    	  return;
      }
      this.tail.next = n;
      this.tail = n;
      this.size ++;
    }
    
    public void addLast (Node n) {
    if(this.isEmpty()) {
    	this.head = n;
    	this.tail = n;
    	this.size ++;
    }else {
    	this.tail.next = n;
    	this.tail = n;
    	this.size++;
    }	
  }
    //T.C => O(n)
    public Node getNode(int index) {
    	if(index >=  this.size) return null;
    	if(index == this.size-1) return this.tail;
    int tempIndex = 0;
    Node temp = this.head;
    while (tempIndex < index) {
    	temp = temp.next;
    	tempIndex++;
    }
    return temp;
    }
    
    //T.C => O(n)
    public void add(int data, int index) {
    	if(index == 0)  {
    		addFirst(data);
    		return;
    	}
    	if(index == this.size-1) {
    	addLast(data);
    	return;
    	}
    	Node prev = getNode(index -1);
    	Node n = new Node(data, null);
    	n.next = prev.next;
    	prev.next = n;
    	this.size++;
    }
    
    //T.C => O(n)
    public int get(int index) {
    	Node n =getNode(index);
    	return n.data;
    }
    
    //T.C => O(n)
    public void set(int data, int index) {
    	Node n = getNode(index);
    	n.data = data;
    }
    
  //T.C => O(1)
    public Node removeFirst() {
    	if(this.size == 0) return null;
    	if(this.size == 1) return this.tail = null;
    	Node nodeToBeRemoved = this.head;
    	this.head  = this.head.next;
    	this.size--;
    	return nodeToBeRemoved;
    }
    
  //T.C => O(n)
    public Node remove(int index ) {
    Node n = getNode(index-1);
    Node nodeToBeRemoved = n.next;
    n.next = n.next.next;
    this.size--;
    return nodeToBeRemoved;
    }
    //utility(helper)  function:
    
    //T.C => O(1)
    public int getSize() {
    	return this.size;
    }
    
    public boolean isEmpty() {
    	return this.size == 0;
    }
    
    
    public void display() {
    	Node temp = this.head;
    	while(temp != null) {
    		System.out.print(temp.data + "->");
    		temp = temp.next;
    		
    	}
    	System.out.println("null");
    }
    
    
    public static void main (String [] args) {
    	LL1 list = new LL1();
    	list.addFirst(5);
    	list.addFirst(4);
    	list.addFirst(3);
    	list.addFirst(2);
    	list.addFirst(1);
    	
        list.display();
        list.addLast(6);
        list.addLast(8);
        list.addLast(9);
        list.display();
        list.add(7, 2);
        list.display();
        
        list.removeFirst();
        list.display();
        list.remove(1);
        list.display();
        
      
    }
}
