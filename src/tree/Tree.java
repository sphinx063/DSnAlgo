package tree;

import java.util.Scanner;

public class Tree {
	Node root;
	
	public void insert(int data){
		Node node = new Node(data);
		Node current = root;
		if(root == null)
			root = node;
		while(current != null){
			if(data < current.data){
				if(current.leftChild == null){
					current.leftChild = node;
					break;
				}
				current = current.leftChild;
			}
			else{
				if(current.rightChild == null){
					current.rightChild = node;
					break;
				}
				current = current.rightChild;
			}
				
		}
		
	}
	public boolean delete(int data){
		if(root == null)
			return false;
		Node current=root;
		Node successor = null;
		Node successorParent = null;
		Node parent = null;
		while(current!=null){
			if(data == current.data){
				break;
			}
			else{
				parent = current;
				if(data < current.data){
					current = current.leftChild;
				}
				else{
					current = current.rightChild;
				}
			}
		}
		if(current == null)
			return false;
		
		if(current.rightChild == null && current.rightChild == null){
			if(current == root){
				root = null;
				return true;			
			}
			if(parent.leftChild == current)
				parent.leftChild = null;
			else
				parent.rightChild = null;
			return true;
		}
		if(current.rightChild == null){
			if(current == root){
				root = current.leftChild;
				return true;			
			}
			if(parent.leftChild == current)
				parent.leftChild = current.leftChild;
			else
				parent.rightChild = current.leftChild;
			return true;
		}
		if(current.leftChild == null){
			if(current == root){
				root = current.rightChild;
				return true;			
			}
			if(parent.leftChild == current)
				parent.leftChild = current.rightChild;
			else
				parent.rightChild = current.rightChild;
			return true;
		}
		successorParent = current;
		successor = current.rightChild;
			
		while(successor.leftChild != null){
			successorParent = successor;
			successor = successor.leftChild;
			
		}
		if(successor == current.rightChild){
			if(current == root){
				root = successor;
				return true;
			}
			if(parent.leftChild == current)
				parent.leftChild = successor;
			else
				parent.rightChild = successor;
			successor.leftChild = current.leftChild;
			return true;
		}
		successorParent.leftChild = successor.rightChild;
		parent.rightChild = successor;
		successor.leftChild = current.leftChild;
		successor.rightChild = current.rightChild;		
		return true;
	}	
	public void traverseInorder(){
		if(root == null)
			System.out.println("Empty Tree");
		else
		recurseInorder(root);
	}
	public void traversePostorder(){
		if(root == null)
			System.out.println("Empty Tree");
		else
		recursePostOrder(root);
	}
	public void traversePreorder(){
		if(root == null)
			System.out.println("Empty Tree");
		else
		recursePreOrder(root);
	}
	
	void recurseInorder(Node root){
		if(root == null){
			//System.out.println("Empty tree");
			return;
		}
		recurseInorder(root.leftChild);
		System.out.println(root.data+"\t");
		recurseInorder(root.rightChild);
	}
	void recursePreOrder(Node root){
		if(root == null)
			return;
		System.out.print(root.data+"\t");
		recursePreOrder(root.leftChild);
		recursePreOrder(root.rightChild);
	}
	void recursePostOrder(Node root){
		if(root == null)
			return;
		recursePostOrder(root.leftChild);
		recursePostOrder(root.rightChild);
		System.out.print(root.data+"\t");
	}
	public int findMaxDepth(Node root){
		if(root.leftChild == null || root.rightChild == null)
			return 0;
		int lh = findMaxDepth(root.leftChild);
		int rh = findMaxDepth(root.rightChild);
		if(lh > rh)
			return lh+1;
		else
			return rh+1;
		
	}
	public int findHeight(){
		return height(root);
	}
	int height(Node root){
		if(root == null)
			return 0;
		int lheight = height(root.leftChild);
		int rheight = height(root.rightChild);
		if(lheight>rheight)
			return lheight+1;
		else
			return rheight+1;
	}
	public void leveOrder(){
		if(this.root == null){
			return;
		}
		int h = findHeight();
		for(int  i = 1;i<=h;i++){
			printLevel(this.root,i);
		}
	}
	public void printLevel(Node x,int level){
		if(x == null)
			return;
		if(level == 1){
			System.out.print(x.data+" ");
		}
		else{
			printLevel(x.leftChild,level-1);
			printLevel(x.rightChild,level-1);
		}
	}
	public void swapNodes(){
		Scanner s = new Scanner(System.in);
		int N  = s.nextInt();
		s.nextLine();
		Node first = new Node(1);
		root = first;
		for(int i = 0;i<N;i++){
			int left = s.nextInt();
			int right = s.nextInt();
			
			Node insertPosition = searchNode(root,i+1);
		//	System.out.println("%%%%%%%  "+insertPosition.data);
			if(left != -1 ){
					//root.data = 1;
					Node lnode = new Node(left);
					insertPosition.leftChild = lnode;
			}
			if(right != -1 ){
				//root.data = 1;
				Node rnode = new Node(right);
				insertPosition.rightChild = rnode;
			}
			s.nextLine();
		}
	}
	Node searchNode(Node startNode, int index){
		if(startNode == null)
			return null;
		if(startNode.data == index){
			//System.out.println("&&&&&&&&&&&&&&");
			return startNode;
		}
		else{
			Node found = searchNode(startNode.leftChild,index);
			if(found == null){
				found = searchNode(startNode.rightChild,index);
			}
			return found;
		}
		
	}
}
