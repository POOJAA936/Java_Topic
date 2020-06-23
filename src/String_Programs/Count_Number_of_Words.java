package String_Programs;
import org.testng.annotations.Test;
public class Count_Number_of_Words 
{
	@Test
	public void openApp()
	{
		String a="hello java how are you";
		String[] b = a.split(" ");
		System.out.println("Total n of words are "+b.length);
	}
}