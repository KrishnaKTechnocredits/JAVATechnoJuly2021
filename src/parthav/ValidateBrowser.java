package parthav;

//Assignment:  Validate the string value of the browser passed and print if its a valid browser or not
// Requirements:  if the value passed is either  "Chrome", "IE" OR "Edge", print valid browser, if its Firefox, Safari, print invalid list of browser, else just print Not a browser at all

class ValidateBrowser{
	void browserCheck(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){   // Condition to check if the browser passed is valid
			System.out.println("This browser is from a valid list of browsers");
		}else if(browser.equals("Firefox") || browser.equals("Safari")){                  // Condition to check if the browser passed is invalid
			System.out.println("This browser is from an invalid list of browsers");
		}else {																			  // Condition to print message if the input is not even a browser
			System.out.println("Please re-check your input. This is not even a valid browser");
		}
	}
	
	public static void main(String [] args){
		ValidateBrowser validateBrowser = new ValidateBrowser();
		validateBrowser.browserCheck("Edge");
		validateBrowser.browserCheck("Firefox");
		validateBrowser.browserCheck("Ninja");
		
	}
}