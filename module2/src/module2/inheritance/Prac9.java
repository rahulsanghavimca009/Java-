package module2.inheritance;
interface Father1 
{
	void hard_working();
	void fast_eating();
	void responsible();
}
interface Mother
{
	void soft_hearted();
	void good_cook();
}
class Child1 implements Father1,Mother
{
	public void hard_working()
	{
		System.out.println("He is hardworking.");
	}
	public void fast_eating()
	{
		System.out.println("He is fast at eating.");
	}
	public void responsible()
	{
		System.out.println("He is responsible.");
	}
	public void soft_hearted()
	{
		System.out.println("He is soft hearted.");
	}
	public void good_cook()
	{
		System.out.println("He is very good at cooking.");
	}
}

public class Prac9 {

	public static void main(String[] args)
	{
		Child1 c=new Child1();
		c.fast_eating();
		c.hard_working();
		c.good_cook();
		c.soft_hearted();
		c.responsible();
	

	}

}
