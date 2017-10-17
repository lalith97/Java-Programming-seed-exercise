package excercise2;

class P1{
	private int day;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
		System.out.print(""+day);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
		System.out.print(""+month);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
		System.out.print(""+year);
	}

	private int month;
	private int year ;

}

public class E2 {
	public static void main(String[] args) {
		P1 p1=new P1();
		p1.getDay();
		p1.setDay(12);
		p1.getMonth();
		p1.setMonth(03);
		p1.getYear();
		p1.setYear(1997);
		
	}

}
