package mayur;

class Assignment3{

	void findWeekdaysAndWeekend(int dayIndex){
		if (dayIndex <= 5 && dayIndex >=1){
			System.out.println("It is Weekday");
		}else if (dayIndex >= 6 && dayIndex <= 7){
			System.out.println("It is Weekend");
		}else if (dayIndex >= 8){
			System.out.println("Invalid Index");
		}else
			System.out.println("Invalid Index due Minus value");
	}
	
	void isValidBrowser(String browser){
		if (browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			System.out.println("It is Valid Browser to use");
		}else 
			System.out.println("It is Invalid Browser to use");
	}
	
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3();
		assignment3.findWeekdaysAndWeekend(4);
		assignment3.findWeekdaysAndWeekend(1);
		assignment3.findWeekdaysAndWeekend(7);
		assignment3.findWeekdaysAndWeekend(8);
		assignment3.findWeekdaysAndWeekend(-3);
		System.out.println("################");
		assignment3.isValidBrowser("Chrome");
		assignment3.isValidBrowser("Egde");
		assignment3.isValidBrowser("IE");
		assignment3.isValidBrowser("Safari");
		assignment3.isValidBrowser("FF");
	}
}