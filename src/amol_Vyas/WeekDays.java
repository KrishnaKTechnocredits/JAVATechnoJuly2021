package amol_Vyas;

class WeekDays{
	
	void findDays(int index){
		if(index >= 1 && index <= 5){
			System.out.println("It is a weekday");
		} else if( index >= 6 && index <= 7){
			System.out.println("It is a weekend, Enjoy..!!");
		} else{
			System.out.println("Invalid Parameter is passed. Please correct it");
		}
	}
	
	public static void main(String[] a){
		WeekDays weekdays = new WeekDays();
		weekdays.findDays(5);
		weekdays.findDays(6);
		weekdays.findDays(1);
		weekdays.findDays(7);
		weekdays.findDays(9);
		weekdays.findDays(-7);
	}

}