package monika;
class Assignment3{
	//Find weekdays or weekend based on dayIndex
	void displayDay(int dayIndex){
		if(dayIndex >=1 && dayIndex <=5){
			System.out.println("\nToday is Weekday");
		}
		else if(dayIndex >=6 && dayIndex <=7){
			System.out.println("Today is Weekend");
		}else
			System.out.println("Invalid Day Index");
	}
	
	//Validate Browser name
	void displayvalidBrower(String browser){
		if(browser.equals("chrome")|| browser.equals("IE")|| browser.equals("Edge"))
			System.out.println("\nThis is valid browser");
		else if(browser.equals("safari")|| browser.equals("FireFox"))
				System.out.println("This is Invalid browser");
	}
	public static void main(String[] args)
	{
			Assignment3 assignment3_1=new Assignment3();
			Assignment3 assignment3_2=new Assignment3();
			assignment3_1.displayDay(5);
			assignment3_1.displayDay(7);
			assignment3_1.displayDay(9);
			assignment3_2.displayvalidBrower("Edge");
			assignment3_2.displayvalidBrower("FireFox");
		}
}