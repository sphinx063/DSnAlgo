package recursion;

public class BinarySearch {

	private int[] searchArray;
	
	
	public int doSearch(int[] searchArray, int key){
		int end = searchArray.length-1;
		int start = 0;
		int mid = end;
		int returnIndex=-1;
		while(start <= end){
			System.out.println("In WHile");
			if(key == searchArray[mid]){
				System.out.println("In equals");
				 return mid;
			}
			if(key > searchArray[mid]){
				System.out.println("In greater");
				start = mid+1;
			}
			if(key < searchArray[mid]){
				System.out.println("In less");
				end = mid-1;
			}
			mid = (start+end)/2;
			
		
	}
		return -1;
	}
	
	public int recursiveSearch(int[] searchArray, int key, int start, int end){
		//int keyIndex=-1;
		if(start > end)
			return -1;
		else if(searchArray[(start+end)/2] == key)
			return (start+end)/2;
		else if(searchArray[(start+end)/2] > key)
			return recursiveSearch(searchArray,key,start,((start+end)/2)-1);
		else
			return recursiveSearch(searchArray,key,((start+end)/2)+1,end);
		
	}
	
}
