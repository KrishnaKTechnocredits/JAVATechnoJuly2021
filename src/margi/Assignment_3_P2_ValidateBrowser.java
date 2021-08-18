package margi;

class Assignment_3_P2_ValidateBrowser{
	
	void validate(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			System.out.println("Valid Browser");
		}else{
			System.out.println("Invalid Browser");
		}
	}
	
	public static void main(String[] args){
		Assignment_3_P2_ValidateBrowser validateBrowser = new Assignment_3_P2_ValidateBrowser();
		validateBrowser.validate("Chrome");
		validateBrowser.validate("Safari");
	}
}