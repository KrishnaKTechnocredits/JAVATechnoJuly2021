package nasir;

class ValidateBrowser{

	void browserName(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			System.out.println("Valid browser");	
	}else if(browser.equals("Safari") || browser.equals("FF")){
		System.out.println("Invaild browser");
}	
	}
	
	public static void main(String[] args){
		ValidateBrowser validateBrowser=new ValidateBrowser();
		validateBrowser.browserName("Chrome");
		validateBrowser.browserName("Safari");
			
	}

}