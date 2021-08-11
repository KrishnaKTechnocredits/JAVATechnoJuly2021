//Assignment 3.1 - If Else Assignment Weekdays/Weekends 
package deepakkankhar;
class Day{
	
	void IdentifyDay(int dayIndex){
		if(dayIndex>0 && dayIndex<6){
			System.out.println("Based on the dayIndex, this is a WEEKDAY");
		}else if (dayIndex>5 && dayIndex<8){
			System.out.println("Based on the dayIndex, this is a WEEKEND");
		}else
			System.out.println("INVALID dayIndex");
	}
	
	public static void main(String[] a){
		Day day=new Day();
		day.IdentifyDay(3);
		day.IdentifyDay(6);
		day.IdentifyDay(11);
		day.IdentifyDay(-3);
	}
}
