package atul_K.Assignments.Ass21;

public class Program1 {

		int[] age = {10,34,38,68,72,95,6};
		
		public static void main(String[] args) {
			Program1 p1= new Program1();
			p1.getagediff();
		}
		
		void getagediff() {
			int max =age[0];
			int min =age[0];
			for(int index=0;index < age.length; index++) {
				if (max < age[index]) {
					max = age[index];
				}
				if (min > age[index]) {
					min = age[index];
				}	
			}
			System.out.println(max-min);
		}
}
