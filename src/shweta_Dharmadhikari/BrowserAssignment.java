// Validate browser name
package shweta_Dharmadhikari;
class BrowserAssignment{
	
	void verifyBrowser(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge"))
		{
			System.out.println("Valid Browser");
		}
		else if(browser.equals("Safari") || browser.equals("FF"))
		{
			System.out.println("Invalid Browser");
		}
	}
	
	public static void main(String[] args){
		BrowserAssignment browserAssignment = new BrowserAssignment();
		browserAssignment.verifyBrowser("Chrome");
		browserAssignment.verifyBrowser("IE");
		browserAssignment.verifyBrowser("FF");
	}
}