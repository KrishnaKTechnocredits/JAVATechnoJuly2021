package precilla;

class Assignment3
{
	void findWeekdaysandWeekend(int dayIndex)
	{
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Entered day is Weekday");
		}else if(dayIndex==6 || dayIndex==7){
			System.out.println("It's Weekends");
		}else{
			System.out.println("Invalid index");
		}		
	}
	void isValidBrowser(String browser)
	{
		if(browser.equals("Chrome")||browser.equals("IE")||browser.equals("Edge")){
			System.out.println("Valid browser");
		}else{
			System.out.println("Invalid browser");
		}
	}
	public static void main(String[] args)
	{
		Assignment3 assignment3 =new Assignment3();
		System.out.println("***Week program***");
		assignment3.findWeekdaysandWeekend(3);//Entered day is Weekday
		assignment3.findWeekdaysandWeekend(6);//It's Weekends
		assignment3.findWeekdaysandWeekend(11);//invalid index
		assignment3.findWeekdaysandWeekend(-3);//invalid index
		System.out.println("***browser program***");
		assignment3.isValidBrowser("Chrome");//Valid browser
		assignment3.isValidBrowser("FireFox");//Invalid browser
		assignment3.isValidBrowser("Mozilla");//Invalid browser
	}
	
}