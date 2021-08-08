package ankita;
class BankAccount{
	String Uname;
	String pswd;
	int bacctnbr;
	
	void setDetails(String username,String pwd,int bankacctnbr){
		Uname=username;
		pswd=pwd;
		bacctnbr=bankacctnbr;
		}
	void updatePassword(String pwd){
		pswd=pwd;
					
		}
	void displyInfo(){
	
		System.out.println("user name is " +Uname);
		System.out.println("user password is " + pswd);
		System.out.println("Account no is " + bacctnbr);
			
		}
		
	public static void main(String[] args){
		BankAccount bankaccount=new BankAccount();
		bankaccount.setDetails("Ankita","AK12345",159753456);
		bankaccount.displyInfo();
		bankaccount.updatePassword("Ka78910@");
		System.out.println("---Updated password and details---");
		bankaccount.displyInfo();
		
		}
	}
	
			   