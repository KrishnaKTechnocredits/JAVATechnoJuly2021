package santosh;
class Assignment6{
	
	float fahrenheit,celsius;
	
	void simpleIntrest(){
	float P=1,R=1,T=1;
	float SI=(P*T*R)/100;
	System.out.println("simple intrest"+SI);
	}
	void fahrenttempCelsiustemp(){
	   celsius = ((fahrenheit - 32)*5)/9;
       System.out.println("temperature in celsius"+celsius);
	}
	public static void main(String [] args){
	Assignment6 assignment6 = new Assignment6();
	assignment6.simpleIntrest();
	assignment6.fahrenttempCelsiustemp();
	
	}
}	