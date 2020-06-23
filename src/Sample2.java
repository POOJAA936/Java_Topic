public class Sample2 
{
	int cost;
	String type;
	int capacity;
	Sample2(int cost,String type,int capacity)
	{
		this.cost=cost;
		this.type=type;
		this.capacity=capacity;
	}
	public static void main(String[] args) 
	{	
		Sample2 s=new Sample2(10,"plastic",500);
		System.out.println(s.cost);
		System.out.println(s.type);
		System.out.println(s.capacity);
	}
}