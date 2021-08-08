package nasir;

class DayIndex{

	void day(int count){

		if(count>=1 && count<6){
		System.out.println("Weekday");
		}else if(count>=6 && count<=7 ){
		System.out.println("WeekEnd");
		}else{
		System.out.println("Invalid Index");
		}
}
	public static void main(String[] args){
		DayIndex dayIndex=new DayIndex();
		dayIndex.day(7);
		dayIndex.day(4);
	}
}