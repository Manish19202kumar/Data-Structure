package days_3;
import java.util.ArrayList;
public class Demo {
		public static void main(String[] args){
			ArrayList<String> a1= new ArrayList<String>();
			a1.add("apple");
			a1.add("orange");
			a1.add("mango");
			a1.add("dragon");
			a1.add("apple");
			a1.add("apple");
			
			int count=0;
			 for(String s1:a1)
			 {
				 if(s1.equals("apple"))
				 {
					 count++;
				 }
			 }
			
		}
	}


