package sort.arrays;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] intArray = { 5,8,10,9,5 };

		countingSort(intArray,5,10);
		System.out.println(Arrays.toString(intArray));

	}
	
	public static void countingSort(int[] input, int min, int max) {
		
		int[] countArray = new int[(max-min)+1];
		
		// on rempli la table index (-min cest de l'opti faire baisser index à 0)
		for(int i =0; i<input.length; i++) {
			countArray[input[i]-min]++;
		}
		
		int j=0;
		// on complete la tab input 
		for (int i= min; i<=max ; i++) {
			while(countArray[i-min]>0) {
				input[j++] = i;
				countArray[i-min]--;
			}
		}
	}
}
