package siddesh_sir;

public class sum_of_givenno_methodwithpara {
	public static void main(String[] args) {
		int no=546;
		String x=add(no);
		System.out.println(x);
	}
	 static String add(int no) {
		 int sum=0;
		 while(no!=0)
		 {
			 int rem=no%10;
			 sum+=rem;
			 no=no/10;
		 }
//		 return String.valueOf(sum);
		return Integer.toString(sum);
	}
}
