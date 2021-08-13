package akanksha_K;

public class Assignment6 {

	void simpleInterest(float p, float t, float r){
		float si;
		si= (p*t*r)/100;
		System.out.println("Simple inetrest- " +si);
	}
	
    void temp(float fah) {
    	float cel;
    	cel=(fah -32)*5/9;
    	System.out.println("Temperature- " +cel);
    } 
    
    public static void main(String[] args) {
    	Assignment6 assignment6 = new Assignment6();
    	assignment6.simpleInterest(10000, 2, 15);
    	assignment6.temp(100); 	
    }
}
