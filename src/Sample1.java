public class Sample1 
{
	void disp()
	{
		System.out.println("hello");
	}
}
class Demo extends Sample1
{
	void test()
	{
		System.out.println("test");
	}
}
class Demo1 extends Demo
{
	void test()
	{
		System.out.println("test");
	}

	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		d1.disp();
		d1.test();
	}
}