
public class Demo {
//	public static void quick_sort( int arr,int lb, int ub) 
// {
//	 int pivot= arr[lb];
//	int i=lb;
//	int j=ub;
//	 int arr[] = {12, 7, 11, 5, 6, 2, 8, 1};
//	 while(i<j)
//	 {
//		 while(arr[i]<=pivot)
//		 {
//			 i++;
//		 }
//		 while(arr[j]>=pivot)
//		 {
//			 j--;
//		 }
//		 if(i<j)
//		 {
//			 swap(arr[i],arr[j]);
//		 }
//	 }
//	 swap(arr[lb],arr[j]);
//	 return j;
// }

//public static void quick_sort( int arr,int lb, int ub)
// if(lb<ub)
// {
//	  loc = partition(arr,lb,ub);
//			 qucik_sort(arr,lb,loc-1);
//			 quick_sort(arr,loc+1,ub);
// }
//}
 public static void main (String[]args) {
	 int[] ar = {35,17,24,15,8,12, 1, 7};

     System.out.print(" array item: ");
     printArray(ar);

     quickSort(ar, 0, ar.length - 1);

     System.out.print("Sorted array: ");
     printArray(ar);
 }

 public static void quickSort(int[] arr , int low, int high) {
     if (low < high) {
         int x = partition(arr, low, high);

         quickSort(arr, low, x - 1);
         quickSort(arr, x + 1, high);
     }
 }

 public static int partition(int[] arr, int low, int high) {
     int pivot = arr[high];
     int i = low - 1;

     for (int j = low; j < high; j++) {
         if (arr[j] < pivot) {
             i++;
             swap(arr, i, j);
         }
     }

     swap(arr, i + 1, high);
     return i + 1;
 }

 public static void swap(int[] arr, int i, int j) {
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
 }

 public static void printArray(int[] arr) {
     for (int value : arr) {
         System.out.print(value + " ");
     }
     System.out.println();
 }
}
  