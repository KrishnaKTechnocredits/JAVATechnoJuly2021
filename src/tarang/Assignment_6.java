package tarang;
	
	public class Assignment_6 {
		int P, T; //P is the principle amount, T is the time(Year)
		float R, farhenheit; // R is the rate which can be in decimal, farhenheit is the temperature
		
		void calculateSimpleInterest(int P, int T, float R) {
			float simpleinterest = (P * T * R)/100;
			System.out.println("Simple Interest= " + simpleinterest);
		}
		
		void convertTemperature(float farhenheit) {
			float celsius = (farhenheit - 32) * 5 / 9;
			System.out.println("Temperature from Farhenheit to Celsuis degree= " + celsius);
		}
		
		public static void main(String[] args) {
			Assignment_6 assignment_6 = new Assignment_6();
			assignment_6.calculateSimpleInterest(60, 3, (float)10.5);
			assignment_6.convertTemperature(85);
		}
	}

