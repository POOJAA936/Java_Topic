package String_Programs;
import org.testng.annotations.Test;
public class Verify_Rotational_String 
{
	@Test
	public void openApp()
	{
		String orgnlstrng="poojapatil";
		String newstrng = orgnlstrng.concat(orgnlstrng);
		String keystng="japapoo";
		if(newstrng.contains(keystng))
		{
			System.out.println("It's a Rotational String");
		}
		else
		{
			System.out.println("It's not a Rotational String");
		}
	}
}