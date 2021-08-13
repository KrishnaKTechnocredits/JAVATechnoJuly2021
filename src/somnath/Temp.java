package somnath;
public class Temp{
	
		void simpleInterest(float p, float T,float R){
			
			float simpleInterest= (p*T*R)/100;
			System.out.println("Simple Interet is "+ simpleInterest);
			}
			
			void tempConvert(float fahrenheit){
		
			float celsius = (fahrenheit - 32)*5/9;
			System.out.println("Temprature in Celsius is:" + celsius);
			}
			
			public static void main(String[] args){
				Temp temp= new Temp();
				temp.simpleInterest(11.2f, 2.5f, 250.20f);
				temp.tempConvert(96.7f);
				}
}				