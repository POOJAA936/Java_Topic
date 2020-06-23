package String_Programs;
import org.testng.annotations.Test;
public class Lower_UpperCase 
{
	@Test
	public void app()
	{
		String a="hello java hi";
		char[] b = a.toCharArray();
		int size = b.length;
		b[0]=(char) (b[0]-32);
		int i=1;
		while(i!=size)
		{
			if(b[i]==' ')
			{
				b[i+1]=(char) (b[i+1]-32);
			}
			i++;
		}
		System.out.println(a);
		System.out.println(b);	
	}	
}