package rushikesh;

class Assignment3{
	void getDay(int num){	
		if(num>=1 && num<=5){
			System.out.println("Weekday");
		}else if(num==6 || num==7){
			System.out.println("Weekend");
		}else{
			System.out.println("Invalid Index");
		}
	}
	
	void getValidBrowser(String browserName){
		if(browserName.equals("Chrome") ||browserName.equals("IE") || browserName.equals("Edge")){
			System.out.println("Valid Browser");
		}else if(browserName.equals("Safari") ||browserName.equals("FF")){
			System.out.println("Invalid Browser");
		}
	}		
	
	public static void main(String[] args){
		Assignment3 assignment3=new Assignment3();
		assignment3.getDay(3);
		assignment3.getDay(6);
		assignment3.getDay(11);
		assignment3.getDay(-3);
		assignment3.getValidBrowser("Chrome");
		assignment3.getValidBrowser("Safari");
	}
}	