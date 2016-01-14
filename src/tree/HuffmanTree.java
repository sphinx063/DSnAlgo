package tree;

public class HuffmanTree {
	
		HuffmanNode root;
		HuffmanTree next;
		public void insert(char data,int frequency){
			HuffmanNode node = new HuffmanNode(data,frequency);
			HuffmanNode current = root;
			if(root == null)
				root = node;
			
			
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
		
		void recurseInorder(HuffmanNode root){
			if(root == null){
				//System.out.println("Empty tree");
				return;
			}
			recurseInorder(root.leftChild);
			System.out.println(root.data+"\t");
			recurseInorder(root.rightChild);
		}
		void recursePreOrder(HuffmanNode root){
			if(root == null)
				return;
			System.out.print(root.data+"\t");
			recursePreOrder(root.leftChild);
			recursePreOrder(root.rightChild);
		}
		void recursePostOrder(HuffmanNode root){
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
}
