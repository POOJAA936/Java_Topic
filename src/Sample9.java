public class Sample9 
{
	void noise()
	{
		System.out.println("Some Noise");
	}
}
class Dog extends Sample9
{
	void noise()
	{
		System.out.println("Bow");
	}
}
class Cat extends Dog
{
	void noise()
	{
		System.out.println("Meou");
	}
}
class Snake extends Cat
{
	void noise()
	{
		System.out.println("Buss"); 
	}
}
class Stimulator
{
	static void ansim(Sample9 s)
	{
		s.noise();
	}
	public static void main(String[] args) 
	{		
		Dog d=new Dog();
		Cat c=new Cat();
		Snake s=new Snake();
		Stimulator.ansim(d);
		Stimulator.ansim(c);
		Stimulator.ansim(s);
	}
}