package chandani.Assignment_30;

public class Assignment30a {
 
	int rno;
	int getReverseNumber(int num){
			
			int r;
			while(num > 0){
					r = num % 10;
				    rno = rno * 10 + r;
					num = num / 10;
			}
			return rno;
		}

		 
		public static void main (String[] args){
			Assignment30a assignment30a = new Assignment30a();
			int num = 12321;
			System.out.println("Reverse of given number " + num  + " is : " + assignment30a.getReverseNumber(num));
			
			Assignment30a assignment30a1 = new Assignment30a();
			int num1 = 121;
			System.out.println("Reverse of given number " + num1  + " is : " + assignment30a1.getReverseNumber(num1));
			
			Assignment30a assignment30a2 = new Assignment30a();
			int num2 = 1232;
			System.out.println("Reverse of given number " + num2  + " is : " + assignment30a2.getReverseNumber(num2));
		}
}

