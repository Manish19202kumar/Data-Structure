package Classpgms;

	import java.util.Arrays;
	import java.util.Scanner;

	public class MereSort_2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        
	        int[] arr1 = new int[size];
	        
	        System.out.print("Enter elements for the array: ");
	        for (int i = 0; i < size; i++) {
	            arr1[i] = sc.nextInt();
	        }
	        
	        // Merge the array
	        int[] mergedArray = merge(arr1);
	        
	        // Sort the merged array
	        Arrays.sort(mergedArray);

	        // Print the sorted array
	        System.out.println(Arrays.toString(mergedArray));
	        
	        sc.close();
	    }

	    public static int[] merge(int[] arr1) {
	        // No need to create a separate merged array here
	        // We can directly sort the original array
	        Arrays.sort(arr1);

	        return arr1;
	    }
	}


