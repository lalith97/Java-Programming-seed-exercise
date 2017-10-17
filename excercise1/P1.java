package excercise1;

class Date

{
	int day = 12, month = 03, year = 1997;

	void init() {
		System.out.println(" " + day + month + year);
	}
}

public class P1 {
	public static void main(String[] args) {
		Date d = new Date();
		d.init();

	}
}
