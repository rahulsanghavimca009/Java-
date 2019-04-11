package module2.ScannerClass;

import java.util.Scanner;

public class Prac3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=sc.nextInt();
		if(marks<0||marks>100)
			System.out.println("marks out of range!!");
		else if(marks>=50)
			System.out.println("PASS!!");
		else
			System.out.println("FAIL!!");
	
		System.out.println("DONE");
		
	

	}

}
