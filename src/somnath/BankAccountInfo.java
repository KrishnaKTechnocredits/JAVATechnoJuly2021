package somnath;
class BankAccountInfo{
    String username;
	String password;
	int bankaccountno;
    
	void setDetails(String uname, String password,int bankaccno){
		username=uname;
		bankaccountno=bankaccno;
		System.out.println("ACCOUNT NAME IS:" +username);
		System.out.println("Account PASSWORD :" +password);
		System.out.println("Account NO  :" +bankaccountno);
    }
	void updatePassword(String updatePassword){
		password = updatePassword;
				
	}
	void displayInfo(){
		System.out.println("****ACCOUNT DETAILS UPDATE*****");
		System.out.println("ACCOUNT NAME IS :" +username);
		System.out.println("Account PASSWORD :" +password);	
		System.out.println("ACCOUNT NO :" +bankaccountno);
	}
	public static void main(String [] args){
		BankAccountInfo bankaccountinfo = new BankAccountInfo();
		bankaccountinfo.setDetails ("SOMNATH","SAMWALTAN@12345",123123);
		bankaccountinfo.updatePassword ("SAMWALTAN@12345");
		bankaccountinfo.displayInfo();
	}
}