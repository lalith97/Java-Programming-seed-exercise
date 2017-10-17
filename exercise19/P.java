package exercise19;

class WrapperDemo
{
	void wrapper()
	{
		
		int a =20;
		System.out.println(a);
		Integer b=new Integer(a);
		System.out.println("int to Wrapper:"+b);
		
		int z=b.intValue();
		System.out.println("Wrapper to primitive "+z);
		
		Integer i = a; 
		int j=i;	
		
		
		
		
	}
	
}
public class P
{
public static void main(String[] args) 
{
	WrapperDemo p=new WrapperDemo();
	p.wrapper();
}
}

