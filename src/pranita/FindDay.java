//Assignment - 3
//Program 1: Find weekdays or weekend based on dayIndex.
//1 -> Monday
//2 -> Tuesday
//7 -> Sunday
//dayIndex -> 3 : Weekday
//dayIndex -> 6 : WeekEnd
//dayIndex -> 11 : Invalid Index
//dayIndex -> -3 : Invalid Index

//Program 2: Validate Browser name.
//Valid list : Chrome, IE, Edge --> Valid browser
//Safari, FF -> Invaild browser
//String browser = "Chrome";
//Hint: browser.equals("Chrome") || browser.equals("IE") || browser.equals("Edge") 


package pranita;
class FindDay{
  
  void showDay(int index){
      if(index>=1 && index<=5){
	  System.out.println("It is a Weekday");
	  }else if(index>=6 && index<=7){
	  System.out.println("It is a Weekend");
	  }else{
	  System.out.println("Invalid index is passed");
      
	  }
	 } 
  void isValidBrowser(String browser){
	  if(browser.equals("Chrome")|| browser.equals("IE")|| browser.equals("Edge")){
		  System.out.println("This is a valid Browser");
	  }else if(browser.equals("Safari")||browser.equals("FF")){
		  System.out.println("This is a Invalid browser");
      }	
      }	  
		  
  public static void main(String[] a){
      FindDay findDay=new FindDay();
      findDay.showDay(1);
	  findDay.showDay(2);
	  findDay.showDay(3);
	  findDay.showDay(7);
	  findDay.showDay(9);
	  findDay.isValidBrowser("IE");
	  findDay.isValidBrowser("Edge");
	  findDay.isValidBrowser("Chrome");
	  findDay.isValidBrowser("Safari");
 
     }
}	 