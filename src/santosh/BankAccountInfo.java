 //Assignment no-05 - Bank account holder's Details..
package santosh; 
class BankAccountInfo{
    String username;
	String password;
	int bankaccountno;
    
	void setDetails(String uname, String password,int bankaccno){
		username=uname;
		bankaccountno=bankaccno;
		System.out.println("Account Holder UserName is :" +username);
		System.out.println("Account Holder Password is :" +password);
		System.out.println("Account Holder Bank Account No .is :" +bankaccountno);
    }
	void updatePassword(String updatePassword){
		password = updatePassword;
				
	}
	void displayInfo(){
		System.out.println("***********Updated**************");
		System.out.println("Account Holder UserName is :" +username);
		System.out.println("Account Holder Password is :" +password);	
		System.out.println("Account Holder Bank Account No.is :" +bankaccountno);
	}
	public static void main(String [] args){
		BankAccountInfo bankaccountinfo = new BankAccountInfo();
		bankaccountinfo.setDetails ("Akshay","Akumar@121",12345789);
		bankaccountinfo.updatePassword ("KumarA#121");
		bankaccountinfo.displayInfo();
	}
}