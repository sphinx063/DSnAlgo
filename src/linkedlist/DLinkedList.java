package linkedlist;

public class DLinkedList {

	private DNode first;
	private DNode last;
	public DLinkedList(){
		first = null;
		last = null;
	}
	public void insertAtFirst(int data){
		DNode newNode = new DNode(data);
		if(first == null){
			first = newNode;
			last = newNode;
		}
		else{
			newNode.right = first;
			first.left = newNode;
			first = newNode;
			
		}
	}
	public void insertAtLast(int data){
		DNode newNode = new DNode(data);
		if(last == null){
			first = newNode;
			last = newNode;
		}
		else{
			last.right = newNode;
			newNode.left = last;
			last = newNode;
		}
	}
	public boolean insertAfter(int key,int data){
		DNode newNode = new DNode(data);
		DNode current = first;
		//boolean insertStatus= false;
		while(current != null){
			if(current.data == key)
				break;
			current = current.right;
		}
		if(current == null)
			return false;
		if(current == last){
			current.right = newNode;
			newNode.left = last;
			last = newNode;
			return true;
		}
		else{
			newNode.right = current.right;
			newNode.left = current;
			current.right.left = newNode;
			current.right = newNode;
			return true;
		}
		
		
	}
	public DNode deleteFirst(){
		DNode temp = null;
		if(first != null){
			temp = first;
			if(last == first){
				last = null;
				first = null;
			}
			else{
				first = first.right;
				first.left = null;
			}	
			
		}
		return temp;
	}
	public DNode deleteLast(){
		DNode temp;
		if(first == null)
			return null;
		if(first!=null && first==last){
			temp = first;
			first = null;
			last = null;
			return temp;
		}

		temp = last;
		last = last.left;
		last.right = null;
		return temp; 
	}
	public DNode delete(int key){
		DNode temp = null;
		DNode current = first;
		while(current != null){
			if(current.data == key)
				break;
			current = current.right;
		}
		if(current == null){
			return null;
		}
		else{
			temp = current;
			if(current == first){
				if(first == last){
					first = null;
					last = null;
				}
				else{
					first = first.right;
					first.left = null;
				}
			}
			else{
				if(current == last){
					last = last.left;
					last.right = null;
				}
				else{
					current.right.left = current.left;
					current.left.right= current.right;
					current.left = null;
					current.right = null;
					
				}
			}
		}
		return temp;	
	}
	public void displayForward(){
		DNode current = first;
		while(current != null){
			System.out.print(current.data+"\t");
			current = current.right;
		}
	}
	public void displayBackward(){
		DNode current = last;
		while(current != null){
			System.out.print(current.data+"\t");
			current = current.left;
		}
	}
}
