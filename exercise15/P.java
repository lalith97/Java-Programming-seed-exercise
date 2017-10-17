package exercise15;

interface Printable 
{
	void print();
}
class Date implements Printable
{
	public void print()
	{
		String date="12/03/1997";
		System.out.println(date);
	}
}
class Shape implements Printable
{
	public void print()
	{
		System.out.println("shape is implememting printable");
	}
}
class Employee implements Printable
{
	String name="lalith";
	
	public void print()
	{
		System.out.println("Emp name:"+name);
	}
}



public class P
{
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

public static void main(String[] args) {
	{
		
		Employee e=new Employee();
		e.print();
		Shape s=new Shape();
		s.print();
		Date d=new Date();
		d.print();
	}
}
}

