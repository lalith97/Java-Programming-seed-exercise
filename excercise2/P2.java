package excercise2;

class A {


	public void A() {
		int day = 12, month = 03, year = 1997;
		System.out.println("this is no argument constructor");
		System.out.println("" + day + month + year);
	}

	
}

class B {
	int day = 12, month = 03, year = 1997;

	public B(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

	}

	void display() {
		System.out.println("" + day + month + year);
	}

}

public class P2 {
	public static void main(String[] args) {
		A a = new A();
		a.A();
		B b = new B(12, 03, 1997);
		b.display();

	}
}
