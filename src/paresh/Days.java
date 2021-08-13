// To print weekdays and weekend
package paresh;

class Days{
	
	void displayResults(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5){
			System.out.println("Weekdays");
		}else if(dayIndex>= 6 && dayIndex<=7){
			System.out.println("Weekend");
		}else{
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String [] args){
		Days days = new Days();
		days.displayResults(3);
		days.displayResults(6);
		days.displayResults(11);
		days.displayResults(-3);
	}
}