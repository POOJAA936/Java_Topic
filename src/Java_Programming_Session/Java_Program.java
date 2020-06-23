package Java_Programming_Session;
import java.util.Scanner;
public class Java_Program 
{
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);		
		System.out.println("enter x ");
		int x=sc.nextInt();
		System.out.println("enter y ");
		int y=sc.nextInt();
		System.out.println("enter z ");
		int z=sc.nextInt();
		if(z-x<z-y)
		{
			System.out.println("Lion 1 wins");
		}
		else if(z-y<z-x)
		{
			System.out.println("Lion 2 wins");
		}
		else if(x==z && y==z)
		{
			System.out.println("deer wins");
		}
	}
}