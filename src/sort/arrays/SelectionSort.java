package sort.arrays;

import java.util.Arrays;


public class SelectionSort {
	
	
	public static void main(String[] args) {
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		
		for (int lastIndexSorted = intArray.length-1; lastIndexSorted >0; lastIndexSorted--) {
			
			int indexGreatestElement = 0;
			for (int i = 0 ; i <= lastIndexSorted ; i++) {
				
				if (intArray[indexGreatestElement] < intArray[i]) {
					indexGreatestElement = i;
				}
			}
			
			BubbleSort.swap(intArray, indexGreatestElement, lastIndexSorted);
			
		}
		
		System.out.println(Arrays.toString(intArray));
	}
	
}
