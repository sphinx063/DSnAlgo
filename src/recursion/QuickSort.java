package recursion;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class QuickSort {

	int[] unsortedArray;
	public QuickSort(int maxSize){	
		unsortedArray = new int[maxSize];
	}
	public void insertElements(){
		Scanner in = new Scanner(System.in);
		int i = 0;
		while(i < unsortedArray.length){
			System.out.println("Enter Input "+i+": ");
			try{
			unsortedArray[i] = in.nextInt();
			}catch(InputMismatchException im){
				System.out.println("Enter a valid integer.");
				continue;
			}
			i++;
		}
	}
	public void quickSort(int lowerBound, int upperBound){
		if(lowerBound == upperBound){
			return;
		}
		else{
			int partitionAt = placePivot(lowerBound,upperBound);
		}
	}
	public int placePivot(int lower,int upper){
		int pivot = unsortedArray[upper];
		int secondHalfLowIndex = upper-1;
		int firstHalfIndex = lower;
		while(true){
		while(firstHalfIndex<upper-1 && unsortedArray[firstHalfIndex] < pivot){
			firstHalfIndex++;
		}
		while(secondHalfLowIndex>0 && unsortedArray[secondHalfLowIndex] > pivot){
			secondHalfLowIndex--;
		}
			
		if(firstHalfIndex >= secondHalfLowIndex )
		break;
		else{
			swap(firstHalfIndex,secondHalfLowIndex);
		}
		//Map<String,String> map = new HashMap<String,String>();
	}
		//swap()
		
		return 0;
	}

	public int[] quick(int low,int high){
		int pivot = unsortedArray[(low+high)/2];
		int i = low;
		int j =high;
		while(i<=j){
			while(unsortedArray[i]<pivot)
				i++;
			while(unsortedArray[j]>pivot)
				j--;
			if(i<=j){
				swap(i,j);
				i++;
				j--;
			}
		}
		if(low<j)
			quick(low,j);
		if(i<high)
		quick(i,high);
		return unsortedArray;
	}
	public void swap(int i,int j){
		int temp = unsortedArray[i];
		unsortedArray[i] = unsortedArray[j];
		unsortedArray[j]= temp;
	}
	public void doQuick(){
		quick(0,unsortedArray.length-1);
		for(int i=0;i<unsortedArray.length;i++){
			System.out.println(unsortedArray[i]);
		}
	}
}
