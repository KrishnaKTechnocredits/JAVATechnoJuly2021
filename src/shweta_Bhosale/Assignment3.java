package shweta_Bhosale;
class Assignment3{
    
	void findWeekdaysAndWeekend(int dayIndex){
		if (dayIndex >=1 && dayIndex <=5 ){
			System.out.println("Weekday");
		}
		else if (dayIndex >= 6 && dayIndex <= 7 ){
			System.out.println("WeekEnd");
		}	
		else {
		System.out.println("Invalid Index");
		}
	}
	void verifyBroswerName(String browserName){
		if (browserName.equals("Chrome") || browserName.equals("IE") || browserName.equals("Edge")){
			System.out.println("Valid Browser");
		}else{
			System.out.println("Invalid Browser");
		}
	}
	public static void main(String[] args){
		Assignment3 assig=new Assignment3();
		assig.findWeekdaysAndWeekend(3);
		assig.findWeekdaysAndWeekend(6);
		assig.findWeekdaysAndWeekend(11);
		assig.findWeekdaysAndWeekend(-3);
		System.out.println("-------------------------------");
		assig.verifyBroswerName("Chrome");
		assig.verifyBroswerName("Safari");
		assig.verifyBroswerName("IE");
		assig.verifyBroswerName("FireFox");
		assig.verifyBroswerName("Edge");
	}
}
