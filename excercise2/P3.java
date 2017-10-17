package excercise2;

class Employee
{
	private int empid;
	private String empname;
	double basicsalary,hra,medical,pf,pt,netsalary,gross_salary;
	
	Employee(int empid,String empname,double bs)//parameterized constructor
	{
		this.empid=empid;
		this.empname=empname;
		this.basicsalary=bs;
		System.out.println("Employee NAme:"+empid+"\nEmploye name"+empname+"\nEmployee Basic Salary:"+bs);
	}
	Employee()//no argument conructor
	{
		
	}
	
	void display()
	{
		hra=(basicsalary*50)/100; 
		pf=(basicsalary*12)/100;
		pt=200;
		System.out.println("\nEmployee Hra="+hra+"\nEmployee Pf="+pf+"\nEmployee PT"+pt);
		gross_salary=basicsalary+hra+medical;
		netsalary=gross_salary-(pt+pf);
		
		System.out.println("\nEmployee Gross Salary is:"+gross_salary+"\nEmployee Net Salary is"+netsalary);
	}
	
}

public class P3 
{
public static void main(String[] args) 
{
	
	Employee z=new Employee(1,"lalith",89592.00);//call a parameterized constructor and created a object of class
	z.display();//calling the method of class
}
}
