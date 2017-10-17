package excercise3;

class MathClass {
	void add(int a, int b) {
		System.out.println("" + (a + b));
	}

	void add(float a, float b) {
		System.out.println("" + (a + b));
	}

	void add(String a, String b) {
		System.out.println("" + (a + b));
	}
}

public class P {
	public static void main(String[] args) {
		MathClass m = new MathClass();
		m.add(5, 4);
		m.add(5000000, 4000000);
		m.add("hel", "lo");
	}

}
