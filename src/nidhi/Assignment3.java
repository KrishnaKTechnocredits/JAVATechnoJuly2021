package nidhi;

class Assignment3{

	void browser(String str){
		if(str.equals("Chrome") || str.equals("IE") || str.equals("Edge")){
			System.out.println("Valid Browser");
		}else if (str.equals("Safari") || str.equals("FF")){
			System.out.println("Invalid Browser");
		}	
	}
	
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
		Assignment3 assignment3 = new Assignment3();
	
		assignment3.dayIndex(2);
		assignment3.dayIndex(11);
		assignment3.dayIndex(6);
		assignment3.dayIndex(-3);
		assignment3.browser("Chrome");
		assignment3.browser("FF");
	}
}