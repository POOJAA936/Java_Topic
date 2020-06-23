package String_Programs;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.testng.annotations.Test;
public class Remove_Duplicate_Char 
{
	@Test
	public void openApp()
	{
		String a="sillyspiders";
		char[] b = a.toCharArray();
		int size = b.length;
		Map<Character, Integer> map=new LinkedHashMap<>();
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(b[i])==false)
			{
				map.put(b[i], 1);
			}
			else
			{
				map.put(b[i], map.get(b[i])+1);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>> lmap = map.entrySet();
		String res="";
		for(Map.Entry<Character, Integer> data:lmap)
		{
			res=res+data.getKey();
		}
		System.out.println(res);
	}
}