package module2.Array;

import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("enter the elements of array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the elements of array are as follow:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<n/2;i++)
		{
			int t;
			t=a[i];
			a[i]=a[n-i-1];
			a[n-1-i]=t;
			
		}
		System.out.println("reverse array:");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println(a[i]);
	    }


	}

}
