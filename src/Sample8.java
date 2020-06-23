public class Sample8 
{
	void test()
	{
		System.out.println("test");
	}
}
class Demo5 extends Sample8
{
	void disp()
	{
		System.out.println("disp");
	}
	public static void main(String[] args) 
	{		
		Sample8 s=new Demo5();
		s.test();
		Demo5 d=(Demo5)s;
		d.disp();
		d.test();
	}
}