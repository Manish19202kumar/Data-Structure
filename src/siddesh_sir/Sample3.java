package siddesh_sir;
//   recursion program
public class Sample3 {
	static void num(int no) {
		if (no >= 1)
			
		{
			System.out.println(no);
			num(no -1);
		}
	}

	public static void main(String[] args) {
		num(10);
	}
}
