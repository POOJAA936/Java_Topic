public class Sample5 
{
	void disp(int a)
	{
		System.out.println("Run int");
	}
	void disp(double a)
	{
		System.out.println("Run double");
	}
	void disp(int a,double b)
	{
		System.out.println("Run int,doble");
	}
	void disp(double a,int b)
	{
		System.out.println("Run double,int");
	}
	public static void main(String[] args) 
	{		
		Sample5 s=new Sample5();
		s.disp(30);
		s.disp(30.5);
		s.disp(30, 30.5);
		s.disp(30.5, 30);
	}
}