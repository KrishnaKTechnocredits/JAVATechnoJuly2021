//To find a daynumber entered 
package bhagyashree;
class Assignment3
{
	void findWeekdaysAndWeekends(int index)
	{
		if(index>0 && index<=5)
		{
			System.out.println("Weekday");
		}
		else if(index>5 && index<=7)
		{
			System.out.println("Weekend");
		}
		else
		{
			System.out.println("Invalid Index");
		}
	}
	
	void isValidBrowser(String browser)
	{
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge"))
		{
			System.out.println("Valid Browser");
		}
		else if(browser.equals("Safari") || browser.equals("FireFox"))
		{
			System.out.println("Invalid Browser");
		}
	}
	public static void main(String[] args)
	{
		Assignment3 assignment3=new Assignment3();
		assignment3.findWeekdaysAndWeekends(6);
		assignment3.findWeekdaysAndWeekends(3);
		assignment3.findWeekdaysAndWeekends(-1);
		
		Assignment3 assignment3_1=new Assignment3();
		assignment3_1.isValidBrowser("FireFox");
		assignment3_1.isValidBrowser("IE");
	}
}