package tree;

import linkedlist.Node;

public class SortedHuffmanList {

	HuffmanTree first;
	public SortedHuffmanList(){
		first = null;
	}
	public void insert(HuffmanTree tree){
		HuffmanTree current=first;
		HuffmanTree previous = null;
		 //newNode = new Node(data);
		int i=0;
		while(current != null){
			//System.out.println("In While"+(++i));
	
			if(current.root.frequency > tree.root.frequency ){
				break;
			}
			previous = current;
			current = current.next;
		}
		if(previous == null){
			tree.next = first;
			first = tree;
	//		System.out.println("First Node: "+first.data);
		}
		else{
	//		System.out.println("Other node:  "+newNode.data);
			tree.next = current;
			previous.next = tree;
		}
		
	}
	public HuffmanTree deleteFirst(){
		HuffmanTree tree = null;
		if(first == null)
			return null;
		tree = first;
		first = first.next;
		return tree;
	}
	
}
