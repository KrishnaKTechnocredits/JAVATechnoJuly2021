//Get account details of user

package sourabh;

class UserDetails{
	
	String userName = "Sourabh";
	int accNo = 123456789;
	int balance = 34000;
	
	void displayDetails(){
	System.out.println("Account holder name = "+ userName);
	System.out.println("Account No. = "+ accNo);
	System.out.println("Available Balance = "+ balance);
	}
	
	public static void main(String[] a){
	
	UserDetails u1 = new UserDetails();
	u1.displayDetails();
	}

}