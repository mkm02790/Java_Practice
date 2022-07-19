package Questions;

public class LinkedListCreation {

	public static void main(String[] args) {
		

	}

}
class LinkedList {
	private Node start;
	private int size;
	public LinkedList() {	}
	
	public boolean isEmpty() {
		if(start==null)
		return true;
		else
			return false ;		
	}
	
	public int getListSize() {
		return size;
	}
	
	public void viewList() {
		Node t;
		if(isEmpty()) System.out.println("List is Empty");
		else {
			t= start;
			for(int i=0;i<size;i++) {
				System.out.println(t.getData());
				t=t.getNext();
			}
		}
	}
	
	public void insertAtFirst(int value ) {
		Node n = new Node();
		n.setData(value);
		n.setNext(start.getNext());
		size++;
	}
}
class Node{
	private int data;
	private Node next;
	public Node() {
		
	}
	public Node(int data, Node next) {
		
		this.data = data;
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}