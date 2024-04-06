package days_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo1 {
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>(Arrays.asList("apple","orange","mango","dragon","apple","apple"));
	
	int count =0;
	for (String s1: a1) 
	{
     if(s1.equals("apple"))
     {
    	 count++;
     }
	}
	System.out.println(count);
}
}
