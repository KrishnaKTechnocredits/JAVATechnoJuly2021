package jagrati;

public class ReturnTypePractice {
	
	double getFulePrice(double dayIndex) {
		
		if(dayIndex == 0) {
			System.out.println("Monday");
			return dayIndex;
		} else {
			System.out.println("Weekned");
		}
		System.out.println("Can be other day");
		return dayIndex ;
		
	} int add(int number1, int number2) {
		int ans = number1 + number2;
		System.out.println("Sum of number " + ans);
		return ans;
	}int sub(int number4, int number5){
		int ans = number4 - number5;
		System.out.println("Sub of number " + ans);
		return ans;
	}int m1(String name){
		if (name.equals("Jagrati")) {
			System.out.println("Name matched");
			return 1;
		}else 
			System.out.println("Name not matched and new name is " + name);
			return 2;
	}// return sum of and mix and min value which is div by 7 with in given range
	
	int getMaxMinValue(int startNumber, int endNumber) {
		
		int maxNumber =0;
		int minNumber =0;
		boolean flag = true;
		for (int number = startNumber; number<=endNumber; number++) {
			if (number%7 ==0) {
				if (flag == true) {
				 minNumber = number;
				}
				maxNumber = number;
				flag =false;
				
			}
		}System.out.println("minNumber" +minNumber );
		System.out.println("maxNumber " + maxNumber);
		System.out.println("Total sum " +(minNumber + maxNumber));
		return minNumber + maxNumber;
			
	}
	
	public static void main(String []aa) {
		ReturnTypePractice returnType = new ReturnTypePractice();
		returnType.getFulePrice(100);
		System.out.println("-----------------------------");
		int total = returnType.add(200,100)+ returnType.sub(300,100);
		System.out.println("Total of number " + total);
		System.out.println("Avg of number " + (total/2));
		System.out.println("-----------------------------------------");
		returnType.m1("seema");
		System.out.println("-----------------------------------------");
		returnType.getMaxMinValue(1, 100);
		
			
	}

}
