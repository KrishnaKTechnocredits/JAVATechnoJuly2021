package prerana;

public class Assignment3{

	void days(int day){
		if(day >7 || day <=1){
		  System.out.println("Invalid input");
		}
		else if(day==6 || day==7){
		   System.out.println("Weekend");
		}
		else if(day >=1 || day <=5)
		{
		   System.out.println("weekdays");
		}  
	}
	
	public static void main(String[] args){
		Assignment3 a= new Assignment3();
		a.days(3);
		a.days(7);
		a.days(12);
		
	}
}
