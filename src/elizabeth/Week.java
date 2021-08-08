
package elizabeth;
class Week{
	
	void displayInfo(int dayIndex){
		
		if(dayIndex<=5 && dayIndex>=1){
			System.out.println("Weekday");
		}
		else if(dayIndex<=7 && dayIndex>=6){
			System.out.println("WeekEnd");
		}
		else{
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String[] args){
		Week week =new Week();
		week.displayInfo(7);
		week.displayInfo(4);
		int index =-3;
		week.displayInfo(index);
	}
}