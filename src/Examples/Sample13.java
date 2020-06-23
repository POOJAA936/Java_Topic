package Examples;
public class Sample13 
{
	public void cycle()
	{
		System.out.println("Cycle");
	}
	private void atmCard()
	{
		System.out.println("ATM");
	}
	void bike()
	{
		System.out.println("Bike");
	}
	protected void car()
	{
		System.out.println("Car");
	}
}
	class Sample2
	{
		public static void main(String[] args) 
		{
			Sample13 s=new Sample13();
			s.bike();
			s.car();
			s.cycle();
		}
}