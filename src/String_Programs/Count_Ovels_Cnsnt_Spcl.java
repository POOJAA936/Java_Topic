package String_Programs;
import org.testng.annotations.Test;
public class Count_Ovels_Cnsnt_Spcl 
{
	@Test
	public void Open()
	{
		String a="hello*12java#";
		char[] b = a.toCharArray();
		int ovlcount=0;
		int cnsntcount=0;
		int spclcount=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>='a' && b[i]<='z')
			{
				if(b[i]=='a' || b[i]=='e' || b[i]=='i' || b[i]=='o' || b[i]=='u')
				{
					ovlcount++;
				}
				else
				{
					cnsntcount++;
				}
			}
			else
			{
				spclcount++;
			}
			i++;
		}
		System.out.println(ovlcount);
		System.out.println(cnsntcount);
		System.out.println(spclcount);	
	}	
}