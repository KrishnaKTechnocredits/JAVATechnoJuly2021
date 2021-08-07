package avinash;
class AssignmentIfElse{
	
	void findWeekdaysAndWeekend(int dayIndex){
	if(dayIndex>=1 && dayIndex<=5){
		System.out.println("weekday");
	}
	else if(dayIndex>5 && dayIndex<=7){
		System.out.println("weekEnd");
	}
	else{
		System.out.println("invalid index");
	}
	}
	void isValidBrowser(String browserName){
		if(browserName.equals("chrome")||browserName.equals("mozilla")||browserName.equals("ie")||browserName.equals("safari")){
			System.out.println("Valid browser");
		}
		else if(browserName.equals("opera") || browserName.equals("UC")){
			System.out.println("Invalid browser");
		}	
	}
	public static void main(String[] args){
		AssignmentIfElse assignmentifelse = new AssignmentIfElse();
		//weekdays and weekend validation
		assignmentifelse.findWeekdaysAndWeekend(3);
		assignmentifelse.findWeekdaysAndWeekend(6);
		assignmentifelse.findWeekdaysAndWeekend(11);
		assignmentifelse.findWeekdaysAndWeekend(-3);
		assignmentifelse.findWeekdaysAndWeekend(7);
		//browser validation
		assignmentifelse.isValidBrowser("chrome");
		assignmentifelse.isValidBrowser("opera");
		assignmentifelse.isValidBrowser("mozilla");
	}
}
