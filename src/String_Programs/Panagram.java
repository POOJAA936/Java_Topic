package String_Programs;
import org.testng.annotations.Test;
public class Panagram 
{
	@Test
	public void open()
	{
		String a="the quick brown fox jumps over a lazy dog";
		a=a.replace(" ", "");
		char[] b = a.toCharArray();
		int size = b.length;
		int c[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int i=0;
		while(i!=size)
		{
			int index = b[i]-65;
			c[index]=1;
			i++;
		}
		i=0;
		while(i!=26)
		{
			if(c[i]==1)
			{
				i++;
			}
			else
			{
				System.out.println("NON-PANAGRAM");
				System.exit(0);
			}
		}
		System.out.println("PANAGRAM");
	}
}