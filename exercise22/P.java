package exercise22;

class Account extends Exception //user defined Exception So we need to inherit the Exception class
{

	void checkBal(double amt) throws Exception
	{
		if (amt >= 1000)//condition amount shod not more than 1000rs
		{
			System.out.println("enough Balance");
		} else {
			Account v = new Account();
			throw v;

		}
	}

}

public class P 
{
public static void main(String[] args)
{
	//try:throws an exception
	try 
	{
		Account v = new Account();
		v.checkBal(4560);
	} catch (Exception e) //It will catch a Exception as a amount is 100rs and Print the Catch block 
	{
		System.out.println("Less Balance Exception " );
	}

}
}


