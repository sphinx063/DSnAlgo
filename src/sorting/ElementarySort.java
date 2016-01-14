package sorting;

public class ElementarySort implements Sort {
	private int nElement;
	private int[] arrayInput;
	private int maxSize;
	public ElementarySort(int maxSize){
		//super(maxSize);
		this.maxSize=maxSize;
		arrayInput=new int[maxSize];
		nElement=0;
	}
	
	@Override
	public void insert(int element){
		if(nElement<maxSize){
			
			arrayInput[nElement++]=element;
		}
		else{
			System.out.println("Array is full");
		}

	}
	
	@Override
	public void display(){
		
		for(int i=0;i<nElement;i++){
			System.out.println(arrayInput[i]);
		}
	}
	
	public void selectionSort(){
		
		for(int i=0;i<nElement;i++){
			int shortIndex=i;
			boolean swap=false;
			for(int j=shortIndex+1;j<nElement;j++){
				if(arrayInput[shortIndex]>arrayInput[j]){
					shortIndex=j;
					swap=true;
				}
			}

				if(swap==true){
					int temp=arrayInput[shortIndex];
					arrayInput[shortIndex]=arrayInput[i];
					arrayInput[i]=temp;
			}
		}
	}
	public void insertionSort(){
		//int sortedArray[]=new int[nElement];
		//sortedArray[0]=arrayInput[0];
		for(int i=1;i<nElement;i++){
			int insertElement=arrayInput[i];
			for(int j=i-1;j>=0;j--){
				if(arrayInput[j]>insertElement){
					arrayInput[j+1]=arrayInput[j];
					arrayInput[j]=insertElement;
				}
				else{
					break;
				}
			}
		}
		//arrayInput=sortedArray;
	}
	public void bubbleSort(){
		for(int i=0;i<nElement;i++){
			for(int j=1;j<nElement-i;j++){
				if(arrayInput[j-1]>arrayInput[j]){
					int temp=arrayInput[j-1];
					arrayInput[j-1]=arrayInput[j];
					arrayInput[j]=temp;
				}
			}
		}
		
	}
}
