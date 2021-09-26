package manaswi;

public class Assignment_6 
{

	void simpleInterest(float p, float t, float r)
	{
		float si;
		si= (p*t*r)/100;
		System.out.println("Simple inetrest- " +si);
	}
	
    void temp(float fah) 
	{
    	float cel;
    	cel=(fah -32)*5/9;
    	System.out.println("Temperature- " +cel);
    } 
    
    public static void main(String[] args) 
	{
    	Assignment_6 assignment_6 = new Assignment_6();
    	assignment_6.simpleInterest(10000, 2, 15);
    	assignment_6.temp(100); 	
    }
}
