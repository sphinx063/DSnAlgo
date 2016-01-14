package linkedlist;

public class SortedList {

	private Node first;
	public SortedList(){
		first = null;
	}
	public void insert(int data){
		Node current=first;
		Node previous = null;
		Node newNode = new Node(data);
		int i=0;
		while(current != null){
			//System.out.println("In While"+(++i));
			if(current.data > data ){
				break;
			}
			previous = current;
			current = current.next;
		}
		if(previous == null){
			newNode.next = first;
			first = newNode;
	//		System.out.println("First Node: "+first.data);
		}
		else{
	//		System.out.println("Other node:  "+newNode.data);
			newNode.next = current;
			previous.next = newNode;
		}
		
	}
	public void display(){
		Node current = first;
	//	System.out.println("First Data" + first.next.next.data);
		while(current != null){
			System.out.print(current.data+"\t");
			current = current.next;
		}
	}
}
