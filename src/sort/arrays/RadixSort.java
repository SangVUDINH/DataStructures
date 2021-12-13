package sort.arrays;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		int[] intArray = { 4725, 4586, 1330,8792 };

		radixSort(intArray,10,4);
		System.out.println(Arrays.toString(intArray));

	}
	// radix = 10: de 0 à 9
	public static void radixSort(int[] input, int radix, int width) {
		for (int i =0 ; i< width; i++) {
			radixSingleSort(input, i, radix);
		}

	}

	private static void radixSingleSort(int[] input, int width, int radix) {
		int numItems = input.length;
		int [] countArray = new int[radix];
		
		for (int value: input ) {
			countArray[getDigit(width, value, radix)]++;
		}		
		System.out.println(Arrays.toString(countArray));
		System.out.println(("ajust countArray"));
		
		for(int j = 1; j< radix; j++) {
			countArray[j] += countArray[j - 1];
		}
		System.out.println(Arrays.toString(countArray));
		
		int[] temp= new int[numItems];
		
		// make stable / à revoir
		for (int tempIndex = numItems -1 ; tempIndex >=0; tempIndex--){
			temp[--countArray[getDigit(width,input[tempIndex], radix)]]= input[tempIndex];
		}
		
		// copy back
		for(int tempIndex =0; tempIndex < numItems;tempIndex++) {
			input[tempIndex]= temp[tempIndex];
		}
		
		
	}
	
	private static int getDigit(int width, int value, int radix) {
		// % chiffre restant apres la division
		return value / (int) Math.pow(10, width) % radix;
	}
}
