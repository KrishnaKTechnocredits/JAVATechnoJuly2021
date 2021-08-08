
package tanmoy_Roy;
class Assignment3{

	void findWeekdaysandWeekend(int Index){
		if (Index>=1 && Index<=5){
			System.out.println("Weekday");
		}
		else if(Index==6 || Index==7){
			System.out.println("WeekEnd");
		}
		else{
			System.out.println("Invalid Entry");
		}
	}
	
	void isValidBrowser(String Name){
		if (Name.equals("Chrome") || Name.equals("IE") || Name.equals("Edge")){
			System.out.println("Valid Browser");
		}
		
		else{
			System.out.println("Invalid Browser");
		}
	}
	
	
	public static void main(String[] args){
		Assignment3 assignment3 = new Assignment3();
		
		assignment3.findWeekdaysandWeekend(3);
		assignment3.findWeekdaysandWeekend(6);
		assignment3.findWeekdaysandWeekend(11);
		assignment3.findWeekdaysandWeekend(-3);
		
		System.out.println("-------------------------------------------------------------");
		
		assignment3.isValidBrowser("Chrome");
		assignment3.isValidBrowser("IE");
		assignment3.isValidBrowser("Edge");
		assignment3.isValidBrowser("Safari");
		assignment3.isValidBrowser("Firefox");
		assignment3.isValidBrowser("XYZ");
	
	}

}

