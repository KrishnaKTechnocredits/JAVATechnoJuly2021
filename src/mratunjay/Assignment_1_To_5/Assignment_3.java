package mratunjay.Assignment_1_To_5;

class Assignment_3{
	 
	void findWeekdaysOrWeekend(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Based on entered value day is Weekday: ");
		}else if(dayIndex ==6 || dayIndex==7){
			System.out.println("Based on endterd value day is Weekend: ");
		}else{
			System.out.println("This is invalid day index");
		}
  }
	
  void  isValidBrowser(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			
			System.out.println("This is Valid Browser"); 
		}else{
			System.out.println("This is invalid Browser");
		}
  }
  public static void main(String[] args){
		
		Assignment_3 A_3 = new Assignment_3();
		A_3.findWeekdaysOrWeekend(6);
		A_3.isValidBrowser("chrome");
	}
}
