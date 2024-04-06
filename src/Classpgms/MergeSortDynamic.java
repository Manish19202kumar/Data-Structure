package Classpgms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortDynamic {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter 1st array to merge: ");
	        
	        int x=sc.nextInt();
//	        int[] arr1=x;
//	        System.out.print("Enter 2nd array to merge: ");
//	        int y=sc.nextInt();
//	        int[] arr2=y;
	        
//	        int[] arr1 = { 10, 7, 8, 9, 1, 5 };
//	        int[] arr2 = { 6, 3, 2, 4 };
//           
	        // Merge the two arrays
	        int[] mergedArray = merge(arr1);

	        // Sort the merged array
	        Arrays.sort(mergedArray);

	       

	 // Print the sorted array
	       
	 System.out.println(Arrays.toString(mergedArray));
	    }

	    public static int[] merge(int[] arr1) {
	        int[] mergedArray = new int[arr1.length];

	        int i = 0, j = 0, k = 0;

	        while (i < arr1.length ) {
//	            if (arr1[i])
	            {
	                mergedArray[k++] = arr1[i++];
	            }
	        }
	        while (i < arr1.length) {
	            mergedArray[k++] = arr1[i++];
	        }

	        

	        return mergedArray;
	    }
}
