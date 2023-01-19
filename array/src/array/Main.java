package array;

public class Main {

	public static void main(String[] args) {
		 //Declaring array
//		int[] number =  {10,20,30};
//		int[] number2 = new int[4];
//		int[] number3 = new int [] {10,20,30,40};
//		
//		number2[0]=10;
//		number2[1]=20;
//		number2[2]=30;
//		number2[3]=40;
//	    
//		System.out.println(number2[3]);
		
		//Declering 2d array
		
//		// 1st way
//		int[] [] number =  {{10,20,30}};
//		// 2nd way
//		int[] [] number2 = new int[4] [3];
//		// 3rd way
//		int number [] [] ={{10,20,30}};
//		
//		int[] number3 = new int [] {10,20,30,40}; 
		
		
//		//String array
//		String[]  Car = {"BMW","TATA","MAHINDRA","VOLVO","HONDA"};
//		System.out.println(Car[0]);
//        for(int i=0 ; i<Car.length; i++) {
//        	System.out.println(Car[i]);
//        }
		
		
		// Array program for min and max value
		
//		int[] Array = {10,11,12,15,45,66,39,79,45,75,57};
//		int max=0,min=Array[0];
//		for(int i=0; i<Array.length; i++)
//		{
//			if(Array[i]>max)
//			{
//				max=Array[i];
//			}
//			if(Array[i]<min)
//			{
//				min=Array[i];
//			}
//		}
//		System.out.println("Minimum vakue" +min);
//		System.out.println("Maximum vakue" +max);
		
		
		//Multidimensional array
		
		//int[][] a = {{2,4,6},{7,9,8},{10,11,12}};
		//System.out.println(a[2][2]);
		
		
		// reading array using for each loop
		//int[][] a = {{2,4,6},{7,9,8},{10,11,12}};
//		for(int[] x:a)
//		{
//			for(int y:x)
//			{
//				System.out.println(y);
//			}
//		}
		
		// reading array using for loop
//		
//		int[][] a = {{2,4,6},{7,9,8},{10,11,12}};
//		for(int i=1; i<2; i++)
//		{
//			for(int j=0; j<a[i].length; j++)
//			{
//				System.out.println(a[i][j]);
//			}
//		}
     
	
	// reverse of a string
	
	String str1 = "Ashutosh";
	String newst="";
	
	for(int i = str1.length()-1; i>=0; i--)
	{
		newst +=str1.charAt(i);
	}
	System.out.println(newst);
}
}
