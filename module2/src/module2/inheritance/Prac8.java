package module2.inheritance;
class Grandfather
{
	public void logical()
	{
		System.out.println("He is logical.");
	}
}
class Father extends Grandfather
{
	public void hardWork()
	{
		System.out.println("He is hardworking.");
	}
}
class Child extends Father
{
	public void artist()
	{
		System.out.println("He is an artist.");
	}
}

public class Prac8 {

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.logical();
		c.hardWork();
		c.artist();
		

	}

}
