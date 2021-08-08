package nidhi;

class DayName{
	
	void dayIndex(int day){
		if(day >7  || day <=1){
			System.out.println("Invalid Index");
		}else if(day==6 || day==7){
			System.out.println("Weekend");
		}else if (day>=1 || day<=5){
			System.out.println("Weekday");
		}
	}
	
	public static void main(String[] ar){
		DayName dayname = new DayName();
		dayname.dayIndex(2);
		dayname.dayIndex(8);
		dayname.dayIndex(6);
		
	}
	
	
}