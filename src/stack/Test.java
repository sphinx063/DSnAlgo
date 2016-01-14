package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args){
		char[] myArray = new char[6];
		myArray[0]='h';
		//System.out.print(Character.getNumericValue(myArray[1]));
		System.out.println("Give Input: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=null,output=null;
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(input!=null){
//			Reverse rev=new Reverse(input);
//			output=rev.reverse();
			InfixToPostix obj = new InfixToPostix(input);
			//System.out.println(input.length());
			System.out.println(obj.convertToPostFix());
			System.out.println(obj.evaluatePostfix());
		}
	//	System.out.println("Reversed String: "+output);
	}
}
