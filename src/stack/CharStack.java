package stack;

public class CharStack {

	private char[] charStack;
	private int maxStackSize;
	private int top;
	public CharStack(int maxStackSize){
		this.maxStackSize = maxStackSize;
		charStack = new char[this.maxStackSize];
		top = -1;
	}
	
	public char pop(){
		return charStack[top--];
	}
	public void push(char pushItem){
		charStack[++top] = pushItem;
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	public boolean isFull(){
		return (top == maxStackSize-1);
	}
}
