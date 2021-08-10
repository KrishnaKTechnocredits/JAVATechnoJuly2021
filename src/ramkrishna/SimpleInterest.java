
package ramkrishna;

	public class SimpleInterest {

		int s1;
	    int d;
		void simpleInterset(int P, int T, int R) {
			
			int s2 = (P*T*R)/100;
			s1=s2; 
			System.out.println("Simple Interset is : " +s2);
		}

		void convertTemp(int f) {
			int c = (f - 32) * 5 / 9;
			//int d= c;
			System.out.println("Convernt Temprature is: "+c);

		}

		void displayInfo() {
			System.out.println("Simple Interset is : " + s1);
			System.out.println("Convert Tempreature is "+ d);

		}

		public static void main(String[] args) {

			SimpleInterest simpleinterest = new SimpleInterest();
			simpleinterest.simpleInterset(2000, 3, 7);
			simpleinterest.convertTemp(56);
			simpleinterest.displayInfo();

		}

	}


