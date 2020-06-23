public class Sample3 
{
	Sample3(int a)
	{
		System.out.println("Running int");
	}
	Sample3(double a)
	{
		this(30);
		System.out.println("Running double");
	}
	Sample3(int a,double b)
	{
		this(30.5);
		System.out.println("Running int,double");
	}
	Sample3(double b,int a)
	{
		this(30,30.5);
		System.out.println("Running double,int");
	}
	public static void main(String[] args) 
	{
		new Sample3(30.5,30);
	}
}