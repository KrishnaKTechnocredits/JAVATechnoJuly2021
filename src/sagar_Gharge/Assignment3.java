package sagar_Gharge;

 
class Assignment3{

	void findWeekdaysAndWeekend (int dayindex){
		if(dayindex>=1 && dayindex<=5){
			System.out.println(" Its a weekday");
		}else if(dayindex==6 || dayindex==7){
			System.out.println(" Its a Weekend");
		}else if(dayindex<1 || dayindex>7){
			System.out.println(" Its a Invalid day");
		}
	}
	
	void isValidBrowesr(String browser){
		if(browser.equals("Chrome") || browser.equals("IE") || browser.equals("Safari")) {
			System.out.println("It is valid Browser");
		}else if(browser.equals("FireFox") || browser.equals("Edge")){
			System.out.println("It is invalid Browser");
		}
	
	}

	public static void main(String[]args){
		Assignment3 assign3 = new Assignment3 ();
		assign3.findWeekdaysAndWeekend(4);
		assign3.findWeekdaysAndWeekend(6);
		assign3.findWeekdaysAndWeekend(-4);
		assign3.isValidBrowesr("IE");
		assign3.isValidBrowesr("Edge");
		}
	}