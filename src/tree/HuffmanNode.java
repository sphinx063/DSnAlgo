package tree;

public class HuffmanNode {
	public char data;
	public int frequency;
	HuffmanNode leftChild;
	HuffmanNode rightChild; 
	public HuffmanNode(char data,int frequency){
		this.data=data;
		this.frequency = frequency;
	}
}
