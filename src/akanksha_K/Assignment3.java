package akanksha_K;

class Assignment3{

	void weekdayandweekend(int day){
	    if (day>=1  && day<=5){
            System.out.println("Weekday");
	    }

	    else if (day>=6  && day<8){
            System.out.println("Weekend");
	    }

	    else {
            System.out.println("Invalid input");
	    }

	}

	void validBrowser(String A){
	    if (A.equals("chrome") || A.equals("Edge") || A.equals("Inetrnet Explorer")){
	        System.out.println("Valid Browser");
	    }

	    else if (A.equals("Safari") || A.equals("FireFox")){
	        System.out.println("Invalid Browser");
	    }
	}

	public  static void main(String[] arg){
        Assignment3 assignment3 = new Assignment3();
        assignment3.weekdayandweekend(3);
        assignment3.weekdayandweekend(6);
        assignment3.weekdayandweekend(11);
        assignment3.weekdayandweekend(-3);
        assignment3.weekdayandweekend(3);
        assignment3.validBrowser("FireFox");
        assignment3.validBrowser("chrome");
     }   
}











