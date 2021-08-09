package shraddha;
class ValidateBrowser{
	public static void main(String[] args){
	ValidateBrowser vb = new ValidateBrowser();
		vb.browserName("h89");
		vb.browserName("Edje");
		vb.browserName("FF");
		vb.browserName("ff");
		vb.browserName("IE");
		vb.browserName("Safari");
		vb.browserName("123");
	}
	
	void browserName(String bname){
		if(bname.equals("Chrome") || bname.equals("IE") || bname.equals("Edje")){
			System.out.println("Valid Browser");
	
		}else if(bname.equals("Safari") || bname.equals("FF")){
			System.out.println("InValid Browser");
		}else{
			System.out.println("InValid name");
		}
	}

}