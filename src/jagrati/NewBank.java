package jagrati;

public class NewBank{
	String username;
	String password;
	int bankAccountNumber;
	
	void setDetails(){
		String username1="Jagrati";
		String password= "red233";
		int bankAccountNumber1=42342;
		username = username1;
		bankAccountNumber= bankAccountNumber1;
		System.out.println("Account holder user name "+ username);
		System.out.println("old updated password " + password);
		System.out.println("Account holder account number "+bankAccountNumber);
		
		
	}
	void updatePassword(){
		String updatePwd = "Test3445";
		password = updatePwd ;
			
	}
	void dispayInfo(){
		System.out.println("Account holder user name "+ username);
		System.out.println("New updated password " + password);
		System.out.println("Account holder account number "+bankAccountNumber);
		
	}
	public static void main(String [] aa){
		NewBank nb = new NewBank();
		nb.setDetails();
		nb.updatePassword();
		nb.dispayInfo();
		
	}

}