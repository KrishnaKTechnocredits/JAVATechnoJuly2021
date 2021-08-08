package apurva;

class AssignmentIfElse{

	void findWeekdaysAndWeekend(int dayCount){
		if(dayCount>=1 && dayCount<=5){
			System.out.println("Today is Weekday");
		}else if(dayCount>5 && dayCount<=7){
			System.out.println("Today is Weekend");
		}else if(dayCount<7 || dayCount>1){
			System.out.println("Invalid index");
		}
	}
	
	void validateBrowser(String browser){
		if(browser.equals("Chrome")|| browser.equals("IE") ||browser.equals("Edge")){
			System.out.println("Valid Browser");
		} else if(browser.equals("Safari")|| browser.equals("Opera")){
			System.out.println("Invalid Browser");
		}
	}

	public static void main (String[] a){
		AssignmentIfElse assign = new AssignmentIfElse();
		assign.findWeekdaysAndWeekend(3);
		assign.findWeekdaysAndWeekend(6);
		assign.findWeekdaysAndWeekend(11);
		assign.findWeekdaysAndWeekend(-3);	
		assign.validateBrowser("Chrome");
		assign.validateBrowser("Safari");
	}
}