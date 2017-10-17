package exercise13;

class Date
{
	
	String month;
	int year;
	 int day;
	
	Date(int d,String m,int y)
	{
		
		this.month=m;
		this.year=y;
		this.day=d;
	}

	@Override
	public int hashCode() 
	
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	
	
	
	}



public class P
{
public static void main(String[] args) 
{
	Date d=new Date(12,"dec",2015);
	Date d1=new Date(12,"dec",2015);
	
System.out.println(d.equals(d1));
}
}
