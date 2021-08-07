/*Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate*/



package sushant;

public class SimpleInterest {
	
	void simpleInterest(int P , int T , double R) {
		double Interest = (P*T*R)/100;
		System.out.println("Simple Interest is: "+Interest);
	}
	
	public static void main(String[] args) {
		SimpleInterest simpleinterest = new SimpleInterest();
		simpleinterest.simpleInterest(100, 8, 7.2);
	}
	
}
