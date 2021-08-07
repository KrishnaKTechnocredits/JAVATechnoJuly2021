package ritabrata;
class Weekday{
	void weekdayIndex(int day){
		if(day<=5 && day>=1){
			System.out.println("Weekday");
		}
		
		else if(day==7 || day==6){
			System.out.println("Weekend");
		}
		
		else{
			System.out.println("Invalid Index");
		}
	}
		public static void main(String[] args){
			Weekday weekday= new Weekday();
			weekday.weekdayIndex(1);
			weekday.weekdayIndex(6);
			weekday.weekdayIndex(11);
			weekday.weekdayIndex(-3);
			
		}
	
	


}