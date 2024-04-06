package Classpgms;

import javax.smartcardio.Card;

public class ICICI {
	private int set pin=1234;
	public void atmpin( )
	{
	return;
	}
	public void setA(int atmpin )
	{
	this. atmpin= atmpin ;
	}
	}
	class Mainclass {
	public static void main ( String [ ] args) {
	ICICI card = new ICICI ( );
	
	System.out.println(card. get atmpin( )) ;
	Card.set atmpin1(1267);
	System.out.println(card. get atmpin( )) ;
	}
	}

























//	 class TDA{
//		 int [][]arr=null;
//		 //tda creation
//		 public TDA(int rowsize,int colsize) {
//			 arr=new int[rowsize] [colsize];
//			 for(int row=0;row<arr.length;row++){
//				 for(int col=0;col<arr[0].length;col++) {
//					 arr[row][col]=Integer.MIN_VALUE;
//				 }
//			 }
//		 }
//		 //tda insertion
//		 public void insertion(int row,int col,int value) {
//			 try {
//				 if(arr[row][col]==Integer.MIN_VALUE) {
//					 arr[row][col]=value;
//					 System.out.println(value+ " is inserted");
//				 }else {
//					 System.out.println("cell is fill");
//				 }
//				 
//			 }catch(Exception e) {
//				 System.out.println("Invalid row and column");
//			 }
//		 }
//	 }
//
//	public class Maniclass {
//
//		public static void main(String[] args) {
//			TDA tda=new TDA(2,2);
//	        tda.insertion(0,0,5);  
//		}
//	}

