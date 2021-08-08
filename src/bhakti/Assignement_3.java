package bhakti;

class Assignement_3{
	
	void findWeekdaysAndWeekend(int day){
		if (day >= 1 &&  day <= 5){
			System.out.println (day+ " is Weekday");
		}else if (day >= 6 && day <= 7){
			System.out.println (day+ " is Weekend");
		}else {
			System.out.println (day+ " is Invalid day");
		}		
	}	
	
	void isValidBrowser (String brw ){
		if (brw.equals("Chrome") || brw.equals("IE") || brw.equals("Edge")){
			System.out.println (brw+ " is Valid browser" );
		}else{
			System.out.println (brw+ " is Invalid browser");
		}		
	}	
		
	public static void main (String[] sr){
		 
		Assignement_3 assignement_3 = new Assignement_3();
		
		System.out.println("==============Out put for Day ==================");
		assignement_3.findWeekdaysAndWeekend(1);
		assignement_3.findWeekdaysAndWeekend(6);
		assignement_3.findWeekdaysAndWeekend(61);
		assignement_3.findWeekdaysAndWeekend(7);
		assignement_3.findWeekdaysAndWeekend(9);
		assignement_3.findWeekdaysAndWeekend(0);
		assignement_3.findWeekdaysAndWeekend(3);
		assignement_3.findWeekdaysAndWeekend(2);
		System.out.println("=============IS Valid Browser =================");
		assignement_3.isValidBrowser("Chrome");
		assignement_3.isValidBrowser("Xyz");
		assignement_3.isValidBrowser("Safari");
		assignement_3.isValidBrowser("Edge");
				
	}	
}