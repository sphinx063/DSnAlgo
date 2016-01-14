package sorting;

public class Test {
	public static void main(String[] args){
//		int[] arr={5,2,8,1,43,3,67,12,21,19,15,221};
//		int[] sort=BubbleSort.sort(arr);
//		for(int i=0;i<sort.length;i++){
//		System.out.println("index :"+i+": "+sort[i]);
//			
//		}
	Sort mSort=new ElementarySort(15);
	mSort.insert(785);
	mSort.insert(895);
	mSort.insert(3);
	mSort.insert(87999);
	mSort.insert(123);
	mSort.insert(67);
	mSort.insert(523);
	mSort.insert(6);
	mSort.insert(77);
	mSort.insert(559);
	mSort.display();
	mSort.insertionSort();
	mSort.display();
	
		}
	
}
