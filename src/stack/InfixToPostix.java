package stack;

public class InfixToPostix {

	private String infixExp;
	private char[] postfixExp;
	private CharStack opStack;
	private char[] opCharArray = {'+','-','*','/'};
	private int postFixPosition;
	private boolean parseSuccess;
	public InfixToPostix(String infixExp){
		this.infixExp = infixExp.trim();
		System.out.println(this.infixExp.length());
		postfixExp = new char[this.infixExp.length()];
		opStack = new CharStack(infixExp.length());
		postFixPosition = -1;
		parseSuccess = true;
	}
	public String convertToPostFix(){
		int scanPosition = 0;
		char scannedChar;
		char poppedChar;
		int test=0;
		while(scanPosition < infixExp.length()){
			scannedChar = infixExp.charAt(scanPosition);
			System.out.println(isOpChar(scannedChar));
			if(isOpChar(scannedChar)){
					while(!opStack.isEmpty()){
					poppedChar = opStack.pop();
					if(getPriority(poppedChar) < getPriority(scannedChar)){
						opStack.push(poppedChar);
						break;
					}
					else{
						postfixExp[++postFixPosition] = poppedChar;
					}
					}
					opStack.push(scannedChar);
			}
			else {
				if(scannedChar == '('){
					opStack.push(scannedChar);
					parseSuccess = false;
				}
				else if(scannedChar == ')'){
					parseSuccess = false;
					while(!opStack.isEmpty()){
						poppedChar = opStack.pop();
						if(poppedChar == '('){
							parseSuccess = true;
							break;
						}
						else{
							postfixExp[++postFixPosition] = poppedChar;
						}
					}
				}
				else{
					postfixExp[++postFixPosition] = scannedChar;
				}
			}
			scanPosition++;
		}
		while(!opStack.isEmpty()){
			poppedChar = opStack.pop();
			if(poppedChar == '(')
				parseSuccess = false;
			else
				postfixExp[++postFixPosition] = poppedChar;
		}
		if(parseSuccess){
			System.out.println("Kya Chutiyap "+postfixExp[2]);
			return new String(postfixExp);
		}
		else
			return "Parse Error.";
	}
	int getPriority(char c){
		int priority = -1;
		if(c == '(')
			priority = 0;
		if(c == '+' || c == '-')
			priority = 1;
		if(c == '*' || c == '/')
			priority = 2;
		return priority;
	}
	boolean isOpChar(char c){
		boolean status = false;
		for (char op : opCharArray) {
			if(op == c){
				status = true;
				break;
			}
		}
		return status;
	}
	public double evaluatePostfix(){
		System.out.println(postfixExp.length);
		DoubleStack operandStack=new DoubleStack(postfixExp.length);
		int currentPointer = 0;
		double operand1 = 0;
		double operand2 = 0;
		while(currentPointer < postfixExp.length){
			//System.out.println("Current Pointer: "+Character.getNumericValue(postfixExp[currentPointer]));
			System.out.println(Character.getNumericValue('+'));
			try{
			if(!isOpChar(postfixExp[currentPointer])){
				operandStack.push(Double.valueOf(Character.toString(postfixExp[currentPointer])));
			}
			else{
				operand2 = operandStack.pop();
				operand1 = operandStack.pop();
				switch(postfixExp[currentPointer]){
				case '+':
					operandStack.push(operand1+operand2);
					break;
				case '-':
					operandStack.push(operand1-operand2);
					break;
				case '*':
					operandStack.push(operand1*operand2);
					break;
				case '/':
					operandStack.push(operand1/operand2);
					break;
				}
				
			}
			}catch(NumberFormatException ne){
				break;
			}
			currentPointer++;
		}
		return operandStack.pop();
	}
}
