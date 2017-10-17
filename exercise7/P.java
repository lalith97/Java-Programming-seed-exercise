package exercise7;

class Employee {
	int empid, salary;
	String name;

 @Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", name=" + name + "]";
	}

Employee(int empid, int salary, String name) {
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}
 
 
}

public class P {
public static void main(String[] args) {
	Employee e=new Employee(1,1000,"tom");
	System.out.println(e);
	
	
			
	
}
}
