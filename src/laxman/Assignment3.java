package laxman;

//Assignment 3 : Find weekdays or weekend based on day index//

class Assignment3{

	void displayDay(int dayIndex){
		
		if(dayIndex >= 1 && dayIndex <= 5){
			System.out.println("Weekday");
	
		}
		else if(dayIndex >= 6 && dayIndex <= 7){
			System.out.println("Weekend");
		}
		else{
			System.out.println("invalid index");
		}
	}
	void validBrowser(String browser){
		
		if(browser.equals("Chrome")||browser.equals("IE")||browser.equals("Edge")){
			System.out.println("Valid Browser");
			
		}else if(browser.equals("Safari")||browser.equals("Firefox")){
			System.out.println("Invalid Browser");
		}
			
	}
	
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3();
		assignment3.displayDay(1);
		assignment3.displayDay(2);
		assignment3.displayDay(10);
		assignment3.displayDay(7);
		assignment3.validBrowser("IE");
		assignment3.validBrowser("Safari");
		assignment3.validBrowser("Edge");
		
	}
	
}