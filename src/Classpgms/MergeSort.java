package Classpgms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {


	    public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//	        System.out.print("Enter 1st array to merge: ");
//	        
//	        int x=sc.nextInt();
//	        int[] arr1=x;
//	        System.out.print("Enter 2nd array to merge: ");
//	        int y=sc.nextInt();
//	        int[] arr2=y;
	        
	        int[] arr1 = { 10, 7, 8, 9, 1, 5 };
	        int[] arr2 = { 6, 3, 2, 4 };
              
	        // Merge the two arrays
	        int[] mergedArray = merge(arr1, arr2);

	        // Sort the merged array
	        Arrays.sort(mergedArray);

	       

	 // Print the sorted array
	       
	 System.out.println(Arrays.toString(mergedArray));
	    }

	    public static int[] merge(int[] arr1, int[] arr2) {
	        int[] mergedArray = new int[arr1.length + arr2.length];

	        int i = 0, j = 0, k = 0;

	        while (i < arr1.length && j < arr2.length) {
	            if (arr1[i] < arr2[j]) {
	                mergedArray[k++] = arr1[i++];
	            } else {
	                mergedArray[k++] = arr2[j++];
	            }
	        }
	        while (i < arr1.length) {
	            mergedArray[k++] = arr1[i++];
	        }

	        while (j < arr2.length) {
	            mergedArray[k++] = arr2[j++];
	        }

	        return mergedArray;
	    }
	}


