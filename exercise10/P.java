package exercise10;

class Date
{
	int day;
	String month;
	int year;
	void doj(int d,String m,int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
		
	}
}
class Employee 
{
	String name;
	int id;
    String add;
    
    Employee(String n,int id,String add,String empo)
    {
    	this.name=n;
    	this.id=id;
    	this.add=add;
    	Date d=new Date();
    	d.doj(22,"Dec",1995);
    	System.out.println("date of Joining:-"+d.day+"-"+d.month+"-"+d.year);
    	
    }
}
public class P
{
public static void main(String[] args) 
{
Employee e=new Employee("lalith",25,"kesh","86");
System.out.println("Employee Name:"+e.name+"\nEmployee id:"+e.id+"\nEmployee add: "+e.add);

}
}

