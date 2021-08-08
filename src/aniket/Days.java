package aniket;
class Days{
	
		void findWeekdaysAndWeekends(int dayIndex){
			if(dayIndex>=1 && dayIndex <=5){
				System.out.println("It is the weekday");
			}else if(dayIndex >5 && dayIndex<=7){
				System.out.println("It is weekend");
			}
			else{
				System.out.println("It is invalid dayIndex");
			}
		
		}
		
		void verifyBrowser(String browser){
			if(browser.equals("Chrome")|| browser.equals("IE")|| browser.equals("Edge")){
				System.out.println("It is a valid browser");
			}else{
				System.out.println("It is a Invalid browser");
			};
			
		}
		
		public static void main(String[] args){
			Days days = new Days();
			days.findWeekdaysAndWeekends(2);
			days.findWeekdaysAndWeekends(6);
			days.findWeekdaysAndWeekends(-4);
			days.findWeekdaysAndWeekends(7);
			System.out.println("**************************");
			days.verifyBrowser("IE");
			days.verifyBrowser("Chrome");
			days.verifyBrowser("Edge");
			days.verifyBrowser("safari");
		}
}