package anuja;

class Assignment_3{

	void findWeekday(int dayindex){
		if(dayindex>=1 && dayindex<=5){
			System.out.println("dayindex ->"+dayindex+" :Weekday");
		}
		else if(dayindex==6 || dayindex==7){
			System.out.println("dayindex ->"+dayindex+" :Weekend");
		}
		else{
			System.out.println("dayindex ->"+dayindex+" :InvalidIndex");	
		}
	}
		
		
	void browserName(String Name){
		if(Name.equals("Chrome")|| Name.equals("IE") || Name.equals("Edge")){
			System.out.println(Name+ " is a valid browser");
		}
		else if(Name.equals("Safari")|| Name.equals("FF")){
			System.out.println(Name+ " is an invalid browser");
		}
	}	
	
	public static void main(String args[]){
		Assignment_3 assignment_3=new Assignment_3();
		assignment_3.findWeekday(3);
		assignment_3.findWeekday(6);
		assignment_3.findWeekday(11);
		assignment_3.findWeekday(3);
		System.out.println("*******");
		assignment_3.browserName("FF");
		assignment_3.browserName("Safari");
		assignment_3.browserName("IE");
		assignment_3.browserName("Chrome");
		assignment_3.browserName("Edge");
	}
}