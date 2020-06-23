package String_Programs;
import org.testng.annotations.Test;
public class Verify_Strinng_Contains_Integer 
{
	@Test
	public void app()
	{
		String a="Heloohi";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)>='0' && a.charAt(i)<='9')
			{
				i++;
			}
			else
			{
				System.out.println("String contains integer");
			}	
		}
		System.out.println("String does not contains integer");
	}	
}