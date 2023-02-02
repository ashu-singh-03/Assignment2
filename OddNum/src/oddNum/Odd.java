package oddNum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Random 4 Digits to Check : ");
	
		List<Integer> checker=new ArrayList();
		checker.add(sc.nextInt());
		checker.add(sc.nextInt());
		checker.add(sc.nextInt());
		checker.add(sc.nextInt());
		checker.forEach(odd->
		    {
			if(odd%2!=0)
				System.out.println("The Odd Numbers are : "+odd);
			});
		sc.close();
	}

}
