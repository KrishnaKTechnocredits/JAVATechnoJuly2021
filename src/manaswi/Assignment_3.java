package manaswi;

public class Assignment_3
{
	void DayIndex(int day)
	{
	    if (day>=1  && day<=5){
            System.out.println("This is Weekday");
	    }

	    else if (day>=6  && day<8)
		{
            System.out.println("This is Weekend...Enjoy!!");
	    }

	    else 
		{
            System.out.println("Invalid input");
	    }

	}

	void validBrowser(String A)
	{
	    if (A.equals("chrome") || A.equals("Edge") || A.equals("Inetrnet Explorer")){
	        System.out.println("Valid Browser");
	    }

	    else if (A.equals("Safari") || A.equals("FireFox")){
	        System.out.println("Invalid Browser");
	    }
	}

	public  static void main(String[] arg)
	{
        Assignment_3 assignment_3 = new Assignment_3();
        assignment_3.DayIndex(3);
        assignment_3.DayIndex(6);
        assignment_3.DayIndex(11);
        assignment_3.DayIndex(-3);
        assignment_3.DayIndex(3);
        assignment_3.validBrowser("chrome");
        assignment_3.validBrowser("FireFox");
     }   
}