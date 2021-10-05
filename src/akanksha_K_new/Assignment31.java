package akanksha_K_new;

public class Assignment31 {
	
	int getperfectNumb(int num) {
		int sum =0 ;
		for (int index = 1; index <= num/2; index++) {
			if(num % 2==0) {
				sum = sum+index;
			}
		}		
			if(sum==num) {
				System.out.println(num + " is a prime number");	
				
			}else {
				System.out.println(num + " is not a prime number");
			}
			return num;
	}
	
	boolean perfectSquare(int num) {
			int input = (int)Math.sqrt(num);
			int square = input * input;
			
			if(num==square) {
				System.out.println(num + " is a square number");	
				return true;
			}else {
				System.out.println(num + " is not a square number");
				return true;
			}
	}
	
	int getThreenum(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length-2; index++) {
			if(arr[index]==arr[index+1]-1 && arr[index]==arr[index+2]-2) {
				count++;
			}	
		}
		return count;
		
	}
	
	void isperfectnum(int startindex, int endindex) {
			int perfectnumbercount = 0;
			for (int index = startindex; index <=endindex; index++) {
				int sum= getperfectNumb(index);
				if(sum==index) {
					System.out.println("Given number is " +index+"is a perfect number");
				    perfectnumbercount++;	
				}
			}	
			
			if(perfectnumbercount==0)
				System.out.println("no perfect number");
	}
	
	
	public static void main(String[] args) {
		int[] arr = {10,23,24,25,26,61,62,64,65,66};	
		Assignment31 assi = new Assignment31();
		assi.getperfectNumb(6);
		assi.getperfectNumb(50);
		assi.perfectSquare(25);
		assi.perfectSquare(20);
		System.out.println("The triplet : " + new Assignment31().getThreenum(arr));
		assi.isperfectnum(40, 170);
	}

}
