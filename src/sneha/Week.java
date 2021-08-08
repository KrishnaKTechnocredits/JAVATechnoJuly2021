package sneha;

class Week{
	void dayIndex(int x){
		if((x >= 1) && (x <= 5)){
			System.out.println("Weekday");
		}
		else if((x == 6) || (x == 7)){
			System.out.println("Weekend");
		}
		else{
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String[] a){
		Week week = new Week();
		week.dayIndex(3);
		week.dayIndex(6);
		week.dayIndex(11);
		week.dayIndex(-3);
	}
}