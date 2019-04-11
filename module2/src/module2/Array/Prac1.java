package module2.Array;

public class Prac1 {

	public static void main(String[] args)
	{
		int a[]= {11,6,2,9,1,44,29,3,19};
	    int odd=0,even=0,sumodd=0,sumeven=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even++;
				sumeven+=a[i];
				
			}
			else
			{
				odd++;
				sumodd+=a[i];
			}
			
		}
		System.out.println("number of even numbers are:"+even);
		System.out.println("sum of these even numbers is:"+sumeven);
		System.out.println("number of odd numbers are:"+odd);
		System.out.println("sum of these odd numbers is:"+sumodd);
		

	}

}
