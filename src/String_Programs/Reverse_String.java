package String_Programs;
import org.testng.annotations.Test;
public class Reverse_String 
{
	@Test(enabled=false)
	public void batch1()
	{
		String x="Hello java";
		char[] y = x.toCharArray();
		int i=0;
		int size = y.length;
		while(i!=size)
		{
			y[size-1-i]=y[i];
			i++;
		}
		System.out.println("Original String "+y.toString());
	}
	@Test
	public void app()
	{
		String x="Hello java";
		String y="";
		for(int i=x.length()-1;i>=0;i--)
		{
			y=y+x.charAt(i);
		}
		System.out.println(y);
	}
}