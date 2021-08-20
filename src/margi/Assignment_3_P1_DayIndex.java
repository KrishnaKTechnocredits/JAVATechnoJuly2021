package margi;

class Assignment_3_P1_DayIndex{
	
	void index(int day){
		if(day>=1 && day<=5){
			System.out.println("Weekday");
		}else if(day>=6 && day<=7){
			System.out.println("Weekend");
		}else{
			System.out.println("Invalid Index");
		}					
	}
	
	public static void main(String[] args){
		Assignment_3_P1_DayIndex dayIndex = new Assignment_3_P1_DayIndex();
		dayIndex.index(3);
		dayIndex.index(6);
		dayIndex.index(11);
	}
}