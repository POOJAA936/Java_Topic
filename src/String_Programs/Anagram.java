package String_Programs;
import java.util.Arrays;
import org.testng.annotations.Test;
public class Anagram 
{
	@Test
	public void app()
	{
		String a="listen listen";
		String b="lentsi lentsi";
		a=a.replace(" ", "");
		b=b.replace(" ", "");
		char[] y = a.toCharArray();
		char[] x = b.toCharArray();
		Arrays.sort(y);
		Arrays.sort(x);
		boolean res=Arrays.equals(y, x);
		if(res==true)
		{
			System.out.println("String is an Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}	
	}
}