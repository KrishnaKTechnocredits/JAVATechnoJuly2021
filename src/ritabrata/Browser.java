package ritabrata;
class Browser{
	void browsers(String name){
		if(name.equals("Chrome") || name.equals("IE") || name.equals("Edge")){
			System.out.println("Valid Browser");
		}
		else{
			System.out.println("Inalid Browser");
		}	
	}
	public static void main(String[] args){
		Browser browser= new Browser();
		browser.browsers("Chrome");
		browser.browsers("Safari");
	}


}