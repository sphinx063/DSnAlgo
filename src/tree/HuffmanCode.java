package tree;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import linkedlist.*;;

public class HuffmanCode {
	private String s;
	private Map<Character,Integer> characterMap;
	private Map<Character,String> codeMap;
	SortedHuffmanList priorityQ;
	SortedHuffmanList priorityQTest;
	public HuffmanCode(String s){
		this.s = s;
		priorityQ = new SortedHuffmanList();
		codeMap = new HashMap<Character,String>();
	}
	public void createHuffmanTree(){
		int i = 0;
		characterMap = countChars(s);
		Iterator<Character> it= characterMap.keySet().iterator();
		char current = '\0';
		HuffmanTree tree1 = null;
		HuffmanTree tree2 = null;
		while(it.hasNext()){
			current = it.next();
			HuffmanTree tree = new HuffmanTree();
			tree.insert(current,characterMap.get(current));
			//System.out.println(tree.root.frequency);
			priorityQ.insert(tree);
			
		}
		HuffmanTree currentTree = priorityQ.first;
		while(currentTree !=null){
			//System.out.println(currentTree.root.data);
			currentTree = currentTree.next;
		}
		priorityQTest = priorityQ;
		while(true){
			tree1=priorityQ.deleteFirst();
			tree2=priorityQ.deleteFirst();
			HuffmanTree tree=new HuffmanTree();
			tree.insert('\0', tree1.root.frequency+tree2.root.frequency);
			tree.root.leftChild = tree1.root;
			tree.root.rightChild = tree2.root;
			priorityQ.insert(tree);
			if(priorityQ.first.next == null)
				break;
			
		}
		priorityQ.first.recursePostOrder(priorityQ.first.root);
		createHuffmanCodeTable();
	}

	 Map<Character,Integer> countChars(String s){
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		char current = '\0';
		for(int i=0;i<s.length();i++){
			current = s.charAt(i);
			if(charMap.containsKey(current))
				charMap.put(current,charMap.get(current)+1);
			else
				charMap.put(current,1);
		}
		return charMap;
	}
	//Tree huffmanTree= new Tree();
	void createHuffmanCodeTable(){
		traverseRecursively(priorityQ.first.root);
	}
	void traverseRecursively(HuffmanNode root){
		String code=null;
		if(root == null)
			return;
		if(root.leftChild == null && root.rightChild == null){
			codeMap.put(root.data, code);
		}
		if(root.leftChild != null){
			code = code+"0";
			traverseRecursively(root.leftChild);
		}
		if(root.rightChild != null){
		code = code+"1";
		traverseRecursively(root.rightChild);
		}
	}
		//return null;
	public Map<Character,String> getCodeMap(){
		return this.codeMap;
	}
	public SortedHuffmanList getPriorityQ(){
		return priorityQ;
	}
	public SortedHuffmanList getPriorityQTest(){
		return priorityQTest;
	}
}
