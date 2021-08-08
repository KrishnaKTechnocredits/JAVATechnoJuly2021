package chirag;

//Assignment 3

class Assignment3{

	void findWeekdaysAndWeekend(int dayIndex){
		if(dayIndex>=1 && dayIndex <=5){
			System.out.println("Weekday");
		}
		else if(dayIndex >=6 && dayIndex <=7){
			System.out.println("Weekdend");
		}
		else{
			System.out.println("Invalid Index");
		}
	}
	void validateBrowser(String browser){
		if(browser.equals("Chrome") || browser.equals("Mozilla") || browser.equals("Opera")){
			System.out.println("Valid Browser");
		}
		else if(browser.equals("Debit") || browser.equals("Safari") || browser.equals("Crystal")){
			System.out.println("Invalid Browser");
		}
	}
	public static void main(String[]args){
		Assignment3 assignment3 = new Assignment3();
		assignment3.findWeekdaysAndWeekend(1);
		assignment3.findWeekdaysAndWeekend(4);
		assignment3.findWeekdaysAndWeekend(3);
		assignment3.findWeekdaysAndWeekend(7);
		assignment3.findWeekdaysAndWeekend(11);
		assignment3.findWeekdaysAndWeekend(6);
		assignment3.findWeekdaysAndWeekend(5);
		assignment3.findWeekdaysAndWeekend(2);
		assignment3.findWeekdaysAndWeekend(-11);
		
		System.out.println("------------Find valid browser-------------");
		assignment3.validateBrowser("Chrome");
		assignment3.validateBrowser("Crystal");
		assignment3.validateBrowser("Debit");
		assignment3.validateBrowser("Mozilla");
		assignment3.validateBrowser("Opera");
		assignment3.validateBrowser("Safari");
	}
	
}
