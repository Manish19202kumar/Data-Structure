package days_3;

public class rucursion_add_givenno {
public static void main(String[] args) {
	System.out.println(add(1));
}
static int add(int no)
{
	if(no==5)
	{
		return no;
	}
	else{
		return no+ add(no +1);
	}
}
} 
