public interface Sample12 
{
	void test();
	void disp();
	class Demo implements Sample12
	{
		public void test()
		{
			System.out.println("test");
		}
		public void disp()
		{
			System.out.println("disp");
		}	
	}
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.test();
		d.disp();
	}
}