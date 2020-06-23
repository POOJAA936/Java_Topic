package String_Programs;
import org.testng.annotations.Test;
public class Swap_Two_Strings 
{
	@Test(enabled=false)
	public void openApp()
	{
		String a="Pooja";
		String b="Patil";
		String temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
	@Test
	public void app()
	{
		String a="Pooja";
		String b="Patil";
		a=a+b;
		System.out.println(a);
		b=a.substring(0, a.length()-b.length());
		System.out.println(b);
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(a);
		System.out.println(b);
	}
}