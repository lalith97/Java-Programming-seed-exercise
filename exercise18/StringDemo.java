package exercise18;

class StringDemo
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("lalith");//Creating a String Buffer object that has String
		
		System.out.println(""+sb);
		sb.reverse();//reversing the value by using reverse()
		System.out.println("Reversed: \n"+sb);
	}
	}

