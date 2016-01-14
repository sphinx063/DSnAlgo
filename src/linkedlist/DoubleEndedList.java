package linkedlist;

public class DoubleEndedList {
	private Node first;
	private Node last;
	
	public DoubleEndedList(){
		first = null;
		last =null;
	}
	public void insertAtFirst(int data){
		Node newNode = new Node(data);
		if(first == null){
			last = newNode;
		}
		newNode.next = first;
		first = newNode;
	}
	public void insertAtLast(int data){
		Node newNode = new Node(data);
		if(first == null){
			first = newNode;
			
		}
		else{
			last.next = newNode;
			
		}
		last = newNode;
			
	}
	public Node deleteFirst(){
		Node temp = null;
		temp = first;
		if(first != null){
			if(first.next == null){
				last = null;
			}
			first = first.next;
			
		}
		return temp;
	}
}
