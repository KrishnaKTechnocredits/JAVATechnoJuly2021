package shweta_Dharmadhikari;
public class Bank{

	int accountNo = 1;
	String branchName = "Solapur";


	void disInfo()
	{
		System.out.println("Bank account number " +accountNo);
		System.out.println("Branch name is " +branchName);
	}
	
	public static void main(String[] args)
	{
		Bank b1= new Bank();
		b1.disInfo();
	}
}