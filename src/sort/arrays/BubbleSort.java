package sort.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
		
		
		for (int lastIndexSorted = intArray.length-1; lastIndexSorted >0; lastIndexSorted--) {
			
			for (int i = 0 ; i< lastIndexSorted ; i++) {
				
				if (intArray[i]> intArray[i+1]) {
					swap(intArray, i, i+1);
				}
			}						
		}
		
		System.out.println(Arrays.toString(intArray));
	}
	
	
	public static void swap (int[] tab, int i, int j) {
		if (tab[i]==tab[j]) {
			return;
		}
		int tempo = tab[i];
		tab[i] = tab[j];
		tab[j]= tempo;
	}
	
	
	

}
