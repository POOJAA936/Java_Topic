package String_Programs;
import org.testng.annotations.Test;
public class Copy_String 
{
	@Test
	public void batch()
	{
		String a="Hello Java";
		char[] b = a.toCharArray();
		char[] c=new char[b.length];
		int i=0;
		while(i!=b.length)
		{
			c[i]=b[i];
			i++;
		}
		System.out.println(b);
		System.out.println(c);
	}
}