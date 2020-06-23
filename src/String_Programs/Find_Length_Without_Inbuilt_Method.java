package String_Programs;
import org.testng.annotations.Test;
public class Find_Length_Without_Inbuilt_Method 
{
	@Test
	public void findLength()
	{
		String a="Hello java";
		char[] b = a.concat("\0").toCharArray();
		int count=0;
		int i=0;
		while(b[i]!='\0')
		{
			count++;
			i++;
		}
		System.out.println("Lenght is "+count);
	}
}
