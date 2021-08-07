package arti_G;
//Weekdays and weekend days
class Assignment_3{
	
	void findWeekdaysAndWeekends(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Weekdays");
		}
		else if(dayIndex>=6 && dayIndex<=7){
			System.out.println("Weekends");
		}
		else{
			System.out.println("Invalid Index");
		}
	}

	void verifyBrowserName(String browserName){
		if(browserName.equals("Crome") || browserName.equals("IE")|| browserName.equals("Edge")){
			System.out.println("Valid Browser");
		}
		else{	
		System.out.println("Invalid Browser");
		}
	}
	
	public static void main(String[] args){
		Assignment_3 assignment3 = new Assignment_3();
		assignment3.findWeekdaysAndWeekends(3);
		assignment3.findWeekdaysAndWeekends(6);
		assignment3.findWeekdaysAndWeekends(11);
		assignment3.findWeekdaysAndWeekends(-3);
		assignment3.verifyBrowserName("Crome");
		assignment3.verifyBrowserName("IE");
		assignment3.verifyBrowserName("Edge");
		assignment3.verifyBrowserName("Safari");
		assignment3.verifyBrowserName("FF");
	}
	 
	 
}