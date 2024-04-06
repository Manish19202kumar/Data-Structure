package siddesh_sir;

public class Sample4 {
//  recursion program

	static void num(int no) {
		if (no <= 10)
			
		{
			System.out.println(no);
			num(no +1);
		}
	}

	public static void main(String[] args) {
		num(1);
	}
}


