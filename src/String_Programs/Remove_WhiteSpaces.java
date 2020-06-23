package String_Programs;
import org.testng.annotations.Test;
public class Remove_WhiteSpaces 
{
	@Test
	public void openApp()
	{
		String a="hello java	how are	";
		System.out.println(a.replaceAll(" ", ""));
		System.out.println(a.replaceAll("\\t", ""));
		System.out.println(a.replaceAll("\\s", ""));
	}	
}