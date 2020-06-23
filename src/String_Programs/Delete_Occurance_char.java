package String_Programs;
import org.testng.annotations.Test;
public class Delete_Occurance_char 
{
	@Test
	public void openApp()
	{
		String a="poojapatil";
		char[] b = a.toCharArray();
		int size = b.length;
		char key='p';
		String res="";
		int i=0;
		while(i!=size)
		{
			if(b[i]!=key)
			{
				res=res+b[i];
			}
			i++;
		}
		System.out.println(res);
	}
}