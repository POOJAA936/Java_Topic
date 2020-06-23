public class Sample15 
{
	public static void main(String[] args) 
	{		
		Float f=10.5f;//Boxing
		System.out.println(f);
		float f1 = f.floatValue();//Unboxing
		System.out.println(f1);
		
		Integer a=10;
		System.out.println(a);
		int b = a.intValue();
		System.out.println(b);
	}
}