package Java_Programming_Session;
public class Amstrong_Number 
{
	public static void main(String[] args) 
	{		
		int num=153;
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		System.out.println(sum);
		if(sum==temp)
		{
			System.out.println("Amstrong");
		}
		else
		{
			System.out.println("NOt an Amstrong");
		}
	}
}