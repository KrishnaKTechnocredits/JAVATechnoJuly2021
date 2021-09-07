package technocredits1;

class Bank {

	String firstName;
	String lastName;
	String password;
	int accountNumber = 1234;
	int balance = 10000;
	int retryCount = 0;
	boolean isAccountActive = true;
	boolean isLogin = false;
	
	void setDetails(String fname, String lname, String pwd) {
		firstName = fname;
		lastName = lname;
		password = pwd;
	}

	void login(String pwd) {
		if (password.equals(pwd)) {
			System.out.println("User successfully logined");
			retryCount = 0;
			isLogin = true;
		} else {
			isLogin = false;
			retryCount++;
			if (retryCount <= 3) {
				System.out.println("Password is wrong, its your " + retryCount + " attempt");
				if(retryCount == 3)
					isAccountActive = false;
				// DB
			} else {
				System.out.println("Cross max attempt");
			}
		}
	}

	void displayInfo() {
		if (isLogin) {
			System.out.println(firstName);
			System.out.println(lastName);
		}else if(isLogin == false && isAccountActive == true){
			System.out.println("Please do login");
		}else{
			System.out.println("Your account is locked, please connect your branch manager");
		}
	}

	boolean getAccountStatus() {
		return isAccountActive;
	}

	public static void main(String[] args) {
		Bank test = new Bank();
		test.setDetails("maulik", "kanani", "test123");
		test.login("test12");
		test.login("Test12");
		test.login("test123");
		test.login("test@12"); // test123
		test.displayInfo();
	}

}
