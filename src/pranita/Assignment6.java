//Create two parameterized methods in same class. 

//Write a method to compute simple interest   
	//Simple Interest = (P x T x R)/100 
	//Where, 
		//P is the principle amount 
		//T is the time [year] and 
		//R is the rate

 //Write a method to convert temperature from Fahrenheit to Celsius degree.
	// Celsius = (fahrenheit - 32) * 5 / 9

package pranita;

class Assignment6{

     
	void computeSimpleInterest(int P,int T,int R){
	   int simpleInterest= (P*T*R)/100;
	   System.out.println("Simple Interest is = "+simpleInterest);
	}
	
	void convertTemp(float fahrenheit){
	   float celsius = (fahrenheit - 32)*5 / 9;
	   System.out.println("Coversion of Tem from fahrenheit to Celsius is="+celsius);
	   
	}
	
	public static void main(String[] a){
	
	   Assignment6 assignment6= new Assignment6();
	   assignment6.computeSimpleInterest(24000,5,2);
	   assignment6.convertTemp(90);
	}
	
}	