package stack;

public class DoubleStack {
	private double[] doubleStack;
	private int maxStackSize;
	private int top;
	public DoubleStack(int maxStackSize){
		this.maxStackSize = maxStackSize;
		doubleStack = new double[this.maxStackSize];
		top = -1;
	}
	
	public double pop(){
		return doubleStack[top--];
	}
	public void push(double pushItem){
		doubleStack[++top] = pushItem;
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	public boolean isFull(){
		return (top == maxStackSize-1);
	}
}
