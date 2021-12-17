package sort.arrays;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		// ITERATIVE 
//		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
//			int newElement = intArray[firstUnsortedIndex];
//			int i;
//
//			for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
//				intArray[i] = intArray[i - 1];
////			on decale les chiffres superieur à newElement	
//			}
//			intArray[i] = newElement;
//		}
//
//		System.out.println(Arrays.toString(intArray));
//		
//		
//		System.out.println(10 % 3);
//		int result = (int) Math.pow(10, 3);
//		System.out.println(result);
//		System.out.println(874725 / result % 10);

		
		// RECURSIVE
		intersectionSort(intArray, intArray.length);
		System.out.println(Arrays.toString(intArray));
	}
	
	
	public static void intersectionSort(int[] intArray,int numItems) {		
		
		if (numItems <2) {
			return;
		}
		
		intersectionSort(intArray,numItems-1);
		
		// chaque appel on trie le new element,
		int newElement = intArray[numItems-1];
		int i;
		
		for (i = numItems-1; i > 0 && intArray[i - 1] > newElement; i--) {
			intArray[i] = intArray[i - 1];
			//	on decale les chiffres superieur à newElement	
		}
		intArray[i] = newElement;
		}

}
