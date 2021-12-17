package sort.arrays;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		mergeSort(intArray, 0, intArray.length);
		System.out.println(Arrays.toString(intArray));
	}
	
	
	public static void mergeSort(int[] intArray, int start, int end) {
		
		if(end-start <2) {
			return;
		}
		
		int mid = (start+end) /2;
		
		mergeSort(intArray, start, mid);
		mergeSort(intArray, mid, end);		
		mergeDesc(intArray,start,mid,end); // sort between 2 parts sorted
		
	}
	
	public static void merge(int[] intArray, int start,int mid, int end) {
		
		// 	pas besoin de trier si le dernier element du 1er part est inferieur 
		//	à 1er element du 2eme part
		if (intArray[mid -1] <= intArray[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex =0;
		
		int[] intTemp = new int[end-start];
		
		while(i <mid && j<end) {
			intTemp[tempIndex++] = intArray[i] <= intArray[j] ? intArray[i++] : intArray[j++];
		}
		
		// optimisation sur la copy, copy par bloc... a voir en details
		System.arraycopy(intArray, i, intArray, start+tempIndex, mid-i);
		System.arraycopy(intTemp, 0, intArray, start, tempIndex);
	}
	
	public static void mergeDesc(int[] intArray, int start,int mid, int end) {
		
		// 	pas besoin de trier si le dernier element du 1er part est inferieur 
		//	à 1er element du 2eme part
		if (intArray[mid -1] >= intArray[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex =0;
		
		int[] intTemp = new int[end-start];
		
		while(i < mid && j< end) {
			intTemp[tempIndex++] = intArray[i] >= intArray[j] ? intArray[i++] : intArray[j++];
		}
		
		// optimisation sur la copy, copy par bloc... a voir en details
		System.arraycopy(intArray, i, intArray, start+tempIndex, mid-i);
		System.arraycopy(intTemp, 0, intArray, start, tempIndex);
	}

}
