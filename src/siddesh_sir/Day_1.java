package siddesh_sir;
public class Day_1 {
public static void main(String[] args) {
	String str="I LOVE INDIA";
	System.out.println(str);
	char[] ch=str.toCharArray();
	str=str.replaceAll(" ", "");
	int j=str.length()-1;//9
	for(int i=0; i<ch.length;i++)
	{
	if(ch[i]!=' '){
		ch[i]=str.charAt(j);
		j--;
	}
	else{
		ch[i+1]=str.charAt(j);
	}
	}
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);
	}
}
}
