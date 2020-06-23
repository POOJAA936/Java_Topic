public class Sample4 
{
	Sample4(int a)
	{
		System.out.println("Running int");
	}
}
class Demo11 extends Sample4
{
	Demo11(double b)
	{
		super(30);
		System.out.println("Running double");
	}
}
class Demo2 extends Demo11
{
	Demo2(int a,double b)
	{
		super(30.5);
		System.out.println("Running int,double");
	}
	public static void main(String[] args) 
	{		
		new Demo2(30,30.5);
	}
}