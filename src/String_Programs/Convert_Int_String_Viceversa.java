package String_Programs;
import org.testng.annotations.Test;
public class Convert_Int_String_Viceversa 
{
	@Test
	public void openApp()
	{
		String a="12";
		int b = Integer.parseInt(a);
		System.out.println(b);
				
		int c=17;
		String d = Integer.toString(c);
		System.out.println(d);
	}
}