package Classpgms;
import java.util.Arrays;
public class Redbus {
	 //BOOK Red Bus 
	
		public static void main(String[] args) {
			singledimensionarrays str=new singledimensionarrays(5);
			str.insert(0,10);
			str.insert(1, 40);
			str.insert(2, 12);
			str.insert(3, 30);
			str.insert(4, 44);
			str.insert(5, 55);
			str.insert(7, 0);
			str.insert(0, 98);
			
			str.searching(40);
			str.deletion(2);
			System.out.println(Arrays.toString(str.arr));
			
		}
	}
	class singledimensionarrays
	{ 
	 int arr[]=null;
	public singledimensionarrays(int size)
	{
	arr=new int[size];
	for(int i=0;i<size;i++){
		arr[i]=Integer.MIN_VALUE;
		
	}
	}
	public void insert(int location,int value)
	{
		try {
			if(arr[location]==Integer.MIN_VALUE){
				arr[location]=value;
				System.out.println(value+" is added");
			}
			else{
				System.out.println("The cell is already filled");
			}
		} catch (Exception e) {
			System.out.println("Invalid value");
		}
	}
	public int searching(int valuetobesearch)
	{ for (int i = 0; i < arr.length; i++) {
		if(arr[i]==valuetobesearch)
		
			System.out.println("The value "+valuetobesearch+" is in the index of "+i);
			return 1;
		
	}
		System.out.println("The value is not present");
		return -1;
		}
	public void deletion(int indextobedelete){
		try {
			arr[indextobedelete]=Integer.MIN_VALUE;
			System.out.println("The cell is deleted succesfully");
		} catch (Exception e) {
			System.out.println("Invalid index");
		}
	}
	}

