package harshada;

class AssignmentNo2{
	
	void findWeekdaysandWeekends(int dayIndex){
		
		if(dayIndex >=1 && dayIndex <=5 ){
			System.out.println("Its a Weekday");
		}
		else if (dayIndex >=6 && dayIndex <=7){
			System.out.println("Its a Weekend...Enjoy");
		} 
		else {
			System.out.println("Invalid Day Index");
		}
		
	}
	
	void verifybrowser(String browsername){
	
		if(browsername.equals("Chrome") || browsername.equals("IE") || browsername.equals("Edge") ){
			System.out.println("Its a Valid Browser");
		} else {
			System.out.println("Its a Invalid Browser");
		}
	}
	public static void main(String[] a){
	 
		AssignmentNo2 assignmentNo2= new AssignmentNo2();
	 
		assignmentNo2.findWeekdaysandWeekends(1);
		assignmentNo2.findWeekdaysandWeekends(2);
		assignmentNo2.findWeekdaysandWeekends(3);
		assignmentNo2.findWeekdaysandWeekends(4);
		assignmentNo2.findWeekdaysandWeekends(5);
		assignmentNo2.findWeekdaysandWeekends(6);
		assignmentNo2.findWeekdaysandWeekends(7);
		assignmentNo2.findWeekdaysandWeekends(50);
		assignmentNo2.findWeekdaysandWeekends(-7);
		
		System.out.println("\n ");
		
		assignmentNo2.verifybrowser("Chrome");
		assignmentNo2.verifybrowser("Edge");
		assignmentNo2.verifybrowser("IE");
		assignmentNo2.verifybrowser("Firefox");
		
	}

}