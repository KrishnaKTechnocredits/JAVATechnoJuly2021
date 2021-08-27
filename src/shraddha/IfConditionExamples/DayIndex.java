package shraddha.IfConditionExamples;
class DayIndex{

	public static void main(String[] args){
		DayIndex di = new DayIndex();
		di.dayCount(3);
		di.dayCount(5);
		di.dayCount(7);
		di.dayCount(8);
		di.dayCount(1);
		di.dayCount(9);
		di.dayCount(-5);
	}
	
	void dayCount(int dayIndex){
		if(dayIndex<=5 && dayIndex >0){
				System.out.println("Its Weekday");
		}else if(dayIndex == 6 || dayIndex == 7){
				System.out.println(" Its Weekend");
		}else{
				System.out.println("Invalid Index");
			}
	}
}