package shreya;

//Validate browser name
class BrowserName{
	
	void displayBrowserName(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("MS Edge")){
			System.out.println("Valid browser");
		}else if(browser.equals("Safari") || browser.equals("FF")){
			System.out.println("Invalid browser");
		}
	}
	
	public static void main(String[] args){
		BrowserName browsername=new BrowserName();
		browsername.displayBrowserName("Chrome");
	}
}