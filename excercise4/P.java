package excercise4;

class MathClass {
	void add(int...number)
	{
		for(int n : number)
		System.out.println(n);
	
	}
}

public class P {
	public static void main(String[] args) {
		MathClass m=new MathClass();
		m.add(1,2,3);

	}

}
