package chandni_bhojwni;

class Assignment2{

	void displayDay (int dayindex){
		if (dayindex >=1 && dayindex <=5){
		System.out.println ("Weekday");
		} else if (dayindex >= 6 &&  dayindex <=7) {
		System.out.println ("Weekend");
		} else {
		System.out.println ("Invalid Index");
		}
	}
	
	void validBrowser (String browser) {
		if (browser.equals ("Chrome") || browser.equals ("IE") || browser.equals ("Edge")) {
		System.out.println ("Valid Browser");
		} else {
		System.out.println ("Invalid Browser");
		}
	}
		
		
	public static void main (String [] args){
		Assignment2 assignment2 = new Assignment2 ();
		assignment2.displayDay (3);
		assignment2.displayDay (6);
		assignment2.displayDay (11);
		assignment2.displayDay (-3);
		assignment2.validBrowser ("Chrome");
		assignment2.validBrowser ("Safari");
		
	}
	
}