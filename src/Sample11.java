public abstract class Sample11 
{
	abstract void disp();
	abstract void test();
	void cool()
	{
		System.out.println("cool");
	}
}
	class Demo6 extends Sample11
	{
		void disp()
		{
			System.out.println("disp");
		}
	    void test()
		{
			System.out.println("test");
		}
	
	public static void main(String[] args) 
	{		
		Demo6 d=new Demo6();
		d.disp();
		d.test();
		d.cool();
	}
}