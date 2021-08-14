package prerana;

public class Assignment3B{

	void browserInfo(String bname){
		if(bname .equals("chrome")  || bname.equals("IE")  || bname.equals("Edege")){
		  System.out.println("Valid browser");
		}
		else{
		 System.out.println("InValid browser");
		}
	}
	
	public static void main(String[] args){
		Assignment3B a1= new Assignment3B();
		a1.browserInfo("chrome");
		a1.browserInfo("IE");
		a1.browserInfo("safari");
		a1.browserInfo("Edge");
		
	}
}
