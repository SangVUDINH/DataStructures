package sort.arrays;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		quickSort(intArray,0,intArray.length);
		System.out.println(Arrays.toString(intArray));
	}
	
	public static void quickSort(int[] intArray, int startIndex, int endIndex) {
		if(endIndex - startIndex<2) {
			return;
		}
		
		int pivotIndex = partition(intArray,startIndex,endIndex);		
		quickSort(intArray,startIndex,pivotIndex);
		quickSort(intArray,pivotIndex+1,endIndex);
	}

	private static int partition(int[] intArray, int startIndex, int endIndex) {
		// This is using the first element as the pivot
		
		int pivot=intArray[startIndex];
		int i = startIndex;
		int j = endIndex;
		
		while(i<j) {
			// empty loop j--   right to left 
			 while(i<j && intArray[--j] >= pivot);
		
			 if (i < j) {
				 intArray [i] = intArray[j];
			 }
			 System.out.println(Arrays.toString(intArray));
			 // left to right
			 while(i<j && intArray[++i] <= pivot);
			 if (i < j) {
				 intArray [j] = intArray[i];
			 }
		}
		
		intArray[j] =pivot;
		return j;
	}
}
