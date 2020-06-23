public class Sample6 
{
	void disp()
	{
		System.out.println("run disp");
	}
}
class Demo3 extends Sample6
{
	void disp()
	{
		super.disp();
		System.out.println("Running disp");
	}
	public static void main(String[] args) 
	{		
		Demo3 d=new Demo3();
		d.disp();
	}
}