package exercise16;

class Date implements Cloneable
{
		 int day;
		String month;
		int year;
			Date(int d,String m,int y)
		{
			this.day=d;
			this.month=m;
			this.year=y;
		}
		
public Object clone() throws CloneNotSupportedException 
{
		return super.clone();
		}

@Override
public String toString() 
{
	return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
}


}
public class P
{
public static void main(String[] args) throws CloneNotSupportedException
{
	Date c = new Date(22,"march",1997);
	Date c1=(Date) c.clone();
	System.out.println(c);
	System.out.println(c1);
	
}
}
