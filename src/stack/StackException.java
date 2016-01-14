package stack;

public class StackException extends Exception{

	private String message=null;
	
	public StackException(){
		super();
	}
	
	public StackException(String message){
		super(message);
		this.message=message;
	}
	
	
}
