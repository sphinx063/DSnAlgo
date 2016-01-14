package recursion;

public class TriangularNumbers {

	public TriangularNumbers(){
	}
	
	public int getTriangularNumber(int n){
			
		if(n == 1)
			return 1;
		return n+getTriangularNumber(n-1);
	}
}
