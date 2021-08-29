//assignment 3- 3rd August 2021
package neha.assignment_3;
class Assignment3{
	//Find if day is weekday or weekend based on Day index provided by user 
	void findWeekdaysAndWeekend(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Based on day index, day is Weekday");
		}else if(dayIndex ==6 || dayIndex==7){
			System.out.println("Based on day index, day is Weekend");
		}else{
			System.out.println("This is invalid day index");
		}
    }
	//Method to find if browser passed by user is valid browser
    void  isValidBrowser(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			//adding new line
			System.out.println("\r\nThis is Valid Browser"); 
		}else{
			System.out.println("\r\nThis is invalid Browser");
		}
    }
    public static void main(String[] args){
		int dayIndx = 4;
		String browserName = "IE";
		Assignment3 assignment3=new Assignment3();
		assignment3.findWeekdaysAndWeekend(dayIndx);
		assignment3.isValidBrowser(browserName);
	}
}
