package exercise17;

class Account
{
	private int accountid=20;
	String name="lalith";
	private int balance=0;
	class Locker
	{
		int locid;
		String lockerinformation;
		void info(int locid,String lockerinformation)
		{
			this.locid=locid;
			this.lockerinformation=lockerinformation;
		
			System.out.println("Account No:"+accountid+"\nAccount name:"+name+"\nBAlance info"+balance);
			
			System.out.println("LOcker id is:"+locid+"\nLocker info"+lockerinformation);
		}
	}
}
public class P
{
public static void main(String[] args)
{
	Account a=new Account();
	Account.Locker t=a.new Locker();
	t.info(1513077,"your locker in in halt");
	}
}
