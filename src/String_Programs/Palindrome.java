package String_Programs;
import org.testng.annotations.Test;
public class Palindrome 
{
	@Test
	public void openApp()
	{
		String a="Liril";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("Pallindrome");
		}
		System.out.println("Not a Palindrome");
	}
}