public class Sample17 
{
	public static void main(String[] args) 
	{		
		Sample17 s1=new Sample17();
		Sample17 s2=s1;
		Sample17 s3=new Sample17();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
class Source
{
	public int hashcode()
	{
		return 10;
	}
	public static void main(String[] args)
	{
		Source d=new Source();
		System.out.println(d.hashcode());
	}
}