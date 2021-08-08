package madhavi;
class Assignment2{
	void findWeekdaysAndWeekend(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5)
	    {
			System.out.println( "Day "+ dayIndex+" belongs to weekdays");
	    }
	    else if(dayIndex==6 || dayIndex==7)
		{
			System.out.println( "Day "+ dayIndex+" belongs to weekend");
		}
		else
		{	
			System.out.println(dayIndex+" is invalid Day");
		}
    }

	void validateBrowser(String browser){
		if(browser.equals("chrome") || browser.equals("IE") || browser.equals("Microsoft Edge") || browser.equals("safari"))
		{
			System.out.println(browser+" is a valid browser");
		} 
		else
		{ 
			System.out.println(browser+" is a invalid browser");
		}	
	}

	public static void main(String[] args) 
	{	
		Assignment2 assignment2= new Assignment2();
		System.out.println("Program to check vaild weekdays, weekends");
		System.out.println("***************************************************");
		assignment2.findWeekdaysAndWeekend(3);
		assignment2.findWeekdaysAndWeekend(7);
		assignment2.findWeekdaysAndWeekend(-1);
		System.out.println("----------------------------------------------------");
		System.out.println("Program to check vaild browsers");
		assignment2.validateBrowser("chrome");
		assignment2.validateBrowser("safari");
		assignment2.validateBrowser("IE");
		assignment2.validateBrowser("Microsoft Edge");
		assignment2.validateBrowser("TEST");
	}
}
	
	




