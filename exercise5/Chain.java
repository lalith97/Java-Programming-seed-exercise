package exercise5;



	

public class Chain {
		public Chain()
		{
			System.out.println("default");
		}
		public  Chain(int day)
		{
			this();
			System.out.println("day is");
		}
		
		public  Chain(int day ,int month)
		{
			this(1);
		}
		
		public void  Chain(int day,int month,int year)
		{
			this(2,3);
		
		}
		

		
	
public static void main(String[] args) {
	Chain c=new Chain();
	c.Chain(12,3,1997);
	
}
}
