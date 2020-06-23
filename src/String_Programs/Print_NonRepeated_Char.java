package String_Programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.testng.annotations.Test;
public class Print_NonRepeated_Char 
{
	@Test
	public void openApp()
	{
		String a="sillypiders";
		char[] b = a.toCharArray();
		int size = b.length;
		Map<Character, Integer> map=new HashMap<>();
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
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()==1)
			{
				System.out.println(data.getKey());
			}
		}
	}
}