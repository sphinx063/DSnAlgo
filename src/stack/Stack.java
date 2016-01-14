package stack;

import java.lang.reflect.Array;

class Stack<T> {
	
	//private Class<T> classs;
	private T[] stackArray;
	private int maxSize;
	private int top;
	
	@SuppressWarnings("unchecked")
	public Stack(int size){
		maxSize=size;
		top=-1;
		stackArray=(T[])Array.newInstance(stackArray.getClass().getComponentType(),maxSize);
		
	}
	
	public void push(T element){
		stackArray[++top]=element;
	}
	public T pop(){
		return stackArray[top--];
		
	}
	
	public T peek(){
		return stackArray[top];
	}
	public boolean isEmpty(){
		return (top==-1);
	}
	public boolean isFull(){
		
		return (top==maxSize-1);
		
	}
}
