package String_Programs;
import org.testng.annotations.Test;
public class Check_String_Empty 
{
	@Test
	public void openApp()
	{
		String a="";
		if(a.length()==0)
		{
			System.out.println("string is emplty");
			System.exit(0);
		}
		System.out.println("Not Empty");
	}
}
