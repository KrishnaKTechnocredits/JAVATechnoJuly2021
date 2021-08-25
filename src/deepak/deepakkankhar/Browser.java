//Assignment 3.2 - Browser Identification
package deepak.deepakkankhar;

class Browser{
	
	void validateBrowser(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			System.out.println("This is a valid browser");
		}else
			System.out.println("This is an Invalid browser");
	}

	public static void main(String[] a){
		Browser browser1=new Browser();
		Browser browser2=new Browser();

		browser1.validateBrowser("IE");
		browser2.validateBrowser("Safari");
	}

}