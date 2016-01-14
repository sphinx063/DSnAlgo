package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//TriangularNumbers obj = new TriangularNumbers();
		//System.out.println(obj.getTriangularNumber(7));
//		Scanner in = new Scanner(System.in);
//		int[] searchArray = new int[5];
//		int key = 0;
//		int i =0;
//		while(i<searchArray.length){
//			System.out.println("Enter value for array elements");
//			searchArray[i] = in.nextInt();
//			i++;
//		}
//		
//		System.out.println("Enter the value to be searched");
//		key = in.nextInt();
//		BinarySearch search = new BinarySearch();
//		//System.out.println(search.doSearch(searchArray43, key));
//		System.out.println(search.recursiveSearch(searchArray,key,0,searchArray.length));
		//TowerOfHanoi tw= new TowerOfHanoi(64);
		//tw.moveTowerOfHanoi(64, "A", "B", "C");
		int[] A = {5,2,6,8,3};
		//QuickSort sort = new QuickSort(7);
		//sort.insertElements();
		//sort.doQuick();
		Anagram g = new Anagram();
		List<String> list= g.doAnagram("kind");
		for(String s:list){
			System.out.println(s);
		}
		System.out.println(list.size());
	}

}
