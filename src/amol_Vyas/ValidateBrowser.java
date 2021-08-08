package amol_Vyas;

class ValidateBrowser{
	
	void validateBrowserDisplay(String br){
		if(br.equals("Chrome") || br.equals("IE") || br.equals("Edge")){
			System.out.println("It is a valid browser type");
		} else{
			System.out.println("Invalid browser type");
		}
	}

	public static void main(String[] args){
		ValidateBrowser validateBrowser = new ValidateBrowser();
		validateBrowser.validateBrowserDisplay("IE");
		validateBrowser.validateBrowserDisplay("Safari");
		validateBrowser.validateBrowserDisplay("Chorme");
		validateBrowser.validateBrowserDisplay("Firefox");
		validateBrowser.validateBrowserDisplay("Edge");
	}

}
