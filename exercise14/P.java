package exercise14;

abstract class Shape
{
	abstract void area(float r);
}
class Circle extends Shape 
{
	public void area(float r)
	{
	final float pie=3.14f;
	float a;
	a=pie*(r*r);
	System.out.println(a);
	}
}
class Rectangle extends Shape 
{
	public void area(float l)
	{
		float b,a;
		b=20;
		a=l*b;
		System.out.println(a);
	}
}

public class P 
{
	public static void main(String[] args) 
	{
		Circle c=new Circle();
		c.area(20.56f);
		Rectangle r=new Rectangle();
	   r.area(5.6f);
	  
	}
}

