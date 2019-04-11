package module2.ScannerClass;

import java.util.Scanner;

public class Prac4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("enter your choice:");
		int choice=sc.nextInt();
		if(choice>4||choice<0)
		{
			System.out.println("Invalid!!");

		}
		else
		{
			System.out.println("enter 2 nos.:");
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    switch(choice)
		    {
		    case 1:System.out.println("sum="+(a+b));
		           break;
		    case 2:System.out.println("sub="+(a-b));
		           break;
		    case 3:System.out.println("multiplication="+(a*b));
		           break;
		    case 4:System.out.println("division="+((float)(a)/(float)(b)));       
		           break;
		    }
		}


	}

}
