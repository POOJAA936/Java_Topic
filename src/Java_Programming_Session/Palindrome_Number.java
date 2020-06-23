package Java_Programming_Session;
import java.util.Scanner;
public class Palindrome_Number
{
	public static void main(String[] args)
	{
		int num=0;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not an Palindrome");
		}
	}
}