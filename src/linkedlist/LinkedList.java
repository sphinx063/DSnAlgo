package linkedlist;

public class LinkedList {

	private Node first;
	public LinkedList(){
		first = null;
	}
	public void insertAtFirst(int data){
		Node newNode = new Node(data);
		if(first == null)
			first = newNode;
		else{
			newNode.next = first;
			first = newNode;
		}
			
	}
	public void display(){
		Node current=first;
		while(current != null){
			System.out.print(current.data+'\t');
			current = current.next;
		}
	}
	public Node deleteFirst(){
			Node deletedNode = null;
			if(first != null){
				deletedNode = first;
				first = first.next;
			}
			return deletedNode;	
	}
	public int nodeCounts(){
		int count = 0;
		Node current = first;
		while(current != null){
			count++;
			current = current.next;
		}
		return count;
	}
	public Node find(int data){
		Node current = first;
		while(current != null){
			if(current.data == data)
				break;
			else
				current = current.next;
		}
		return current;
	}
	public Node deleteAny(int data){
		Node current = first;
		Node previous = first;
		while(current != null){
			if(current.data == data)
				break;
			else{
				previous = current;
				current = current.next;
			}
		}
		if(current != null){
			if(current == first)
				first = first.next;
			else{
				previous.next = current.next;
				current.next = null;
			}
		}
		return current;
	}
	public void insertAtLast(int data){
		Node newNode = new Node(data);
		Node current = first;
		while(current.next != null)
			current = current.next;
		current.next = newNode;
	}
	public void insertNextTo(int data){
		Node current = first;
	//	Node previous = first;
		Node newNode = new Node(data);
		while(current != null){
			if(current.data == data){
				newNode.next = current.next;
				current.next = newNode;
				break;
			}
			current = current.next;
		}
	}
}
