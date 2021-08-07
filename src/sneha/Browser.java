package sneha;

class Browser{
	void checkValid(String name){
		if((name.equals("Chrome")) || (name.equals("IE")) || (name.equals("Edge"))){
			System.out.println("Valid browser");
		}
		else if((name.equals("FF")) || (name.equals("Safari"))){
			System.out.println("Invalid browser");
		}
		else{
			System.out.println("Not a browser");
		}
	}
	
	public static void main(String[] a){
		Browser browser = new Browser();
		browser.checkValid("sneha");
		browser.checkValid("Chrome");
		browser.checkValid("FF");
	}
}