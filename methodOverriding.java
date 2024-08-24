public class methodOverriding 
{
	public void display()
	{
		System.out.println("Hello");
	}
	
	public static class java extends methodOverriding
	{
		public void display()
		{
			System.out.println("Hello World");
		}
	}
	
	public static void main(String[] args) 
		{
			java j = new java();
			j.display();
		}
}
