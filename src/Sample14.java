public class Sample14 
{
	private int pwd=1707;
	public int getPassword()
	{
		return pwd;
	}
	public void setPassword(int pwd)
	{
		this.pwd=pwd;
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{		
		Sample14 s1=new Sample14();
		System.out.println(s1.getPassword());
		s1.setPassword(0717);
		System.out.println(s1.getPassword());
	}
}