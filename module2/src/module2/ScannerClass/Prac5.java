package module2.ScannerClass;

import java.util.Scanner;

public class Prac5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter upperbound and lowerbound");
	    int lowerbound=sc.nextInt();
	    int upperbound=sc.nextInt();
	    System.out.println("upperbound="+upperbound);
	    System.out.println("lowerbound="+lowerbound);
	    int number=lowerbound,sum=0;
	    do
	    {
	    	sum+=number;
	    	number++;
	    }
	    while(number<=upperbound);
        System.out.println("sum="+sum);
	}

}
