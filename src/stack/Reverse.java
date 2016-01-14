package stack;

class Reverse {
	
	private String stringToReverse=null;
	
	public Reverse(String stringToReverse){
		
		this.stringToReverse=stringToReverse;
	}
	
	public String reverse(){
		
		Stack<Character> reverseStack=new Stack<Character>(stringToReverse.length());
		char[] charArray=new char[stringToReverse.length()];
		int i=0;
		int j=0;
		while(i<stringToReverse.length()){
			reverseStack.push(new Character(stringToReverse.charAt(i)));
			i++;
		}
		while(j<stringToReverse.length()){
			charArray[j++]=reverseStack.pop();
		}
		return new String(charArray);
		
	}

}
