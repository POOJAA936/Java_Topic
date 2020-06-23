package String_Programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.testng.annotations.Test;
public class Max_Occuring_Char 
{
	@Test
	public void openApp()
	{
		String a="pujapolicepatil";
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
		char maxkey=' ';
		int maxValue=0;
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()>maxValue)
			{
				maxkey=data.getKey();
				maxValue=data.getValue();
			}
		}
		System.out.println(maxkey);
		System.out.println(maxValue);
	}	
}