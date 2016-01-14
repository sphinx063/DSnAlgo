package recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MergeSort {

	int[] sortedArray;
	int[] unsortedArray;
	public MergeSort(int nElements){
		unsortedArray = new int[nElements];
		sortedArray = new int[nElements];
	}
	public void fillUnsortedArray(){
		int i=0;
		Scanner in= new Scanner(System.in);
		while(i<unsortedArray.length){
			System.out.println("Enter input for element "+(i+1));
			try{
				unsortedArray[i] = in.nextInt();
				
			}catch(InputMismatchException im){
				System.out.println("Enter a valid integer");
				continue;
			}
			i++;
		}
	}
	
	public void mergeSort(int[] sortedArray,int lowerBound,int upperBound ){
		
		if(upperBound == lowerBound)
			return;
		else{
			int mid = (upperBound+lowerBound)/2;
			mergeSort(sortedArray,lowerBound,mid);
			mergeSort(sortedArray,mid+1,upperBound);
			merge(sortedArray,lowerBound,mid,upperBound);
		}
	}
	public void merge(int[] sortedArray,int lowerBound,int mid,int upperBound){
		int sortedIndex = 0;
		int counter1 = lowerBound;
		int counter2 = mid+1;
		while(counter1 <= mid && counter2 <= upperBound){
			if(unsortedArray[counter1]<unsortedArray[counter2]){
				sortedArray[sortedIndex++] = unsortedArray[counter1];
				counter1++;
			}
			else{
				sortedArray[sortedIndex++] = unsortedArray[counter2];
				counter2++;
			}
			
		}
		while(counter1 <= mid){
			sortedArray[sortedIndex++] = unsortedArray[counter1];
			counter1++;
		}
		while(counter2 <= upperBound){
			sortedArray[sortedIndex++] = unsortedArray[counter2];
			counter2++;
		}
	}
}
