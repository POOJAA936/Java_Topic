public class Sample16 
{
	public static void main(String[] args)
	{
//		String s1="Hello";
//		String s2=new String("Hello");
		Sample16 s1=new Sample16();
		Sample16 s2=new Sample16();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
class Medical 
{
	public String toString()
	{
		return "Medical";
	}
	public static void main(String[] args)
	{
		Medical m=new Medical();
		System.out.println(m.toString());
	}
}