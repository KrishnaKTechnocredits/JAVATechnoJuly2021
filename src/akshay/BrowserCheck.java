package akshay;

class BrowserCheck{
	
	void displayResult(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge") ){
			System.out.println("Valid Browser");
		}
		else if(browser.equals("FireFox") || browser.equals("Safari")){
			System.out.println("Invalid Browser");
		}
	}
	
	public static void main(String[] args){
		BrowserCheck browserCheck = new BrowserCheck();
		browserCheck.displayResult("Chrome");
		browserCheck.displayResult("Edge");
		browserCheck.displayResult("Safari");
	}
}