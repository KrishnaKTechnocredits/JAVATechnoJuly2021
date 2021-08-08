package jagrati;

public class ConditionProgram{
	
	void display(int dayCount){
		if (dayCount>=1 && dayCount<=5){
			System.out.println("Today is Weekday");
		}else if (dayCount==6 || dayCount==7){
			System.out.println("today is Week End");
		}else if (dayCount<= 8){
			System.out.println("it is Invalid day");
		}else{
			System.out.println("it is Invalid day");
		}
	}void isVaildBrowser(String browser){
		if (browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge")){
			System.out.println("Valid browser");
		}else{
			System.out.println("invalid browser");
		}
		
	}
	
	public static void main(String[]a){
		ConditionProgram cp = new ConditionProgram();
		cp.display(3);
		cp.display(6);
		cp.display(10);
		cp.display(-3);
		cp.isVaildBrowser("IE");
		cp.isVaildBrowser("Firefox");
	}
		
}