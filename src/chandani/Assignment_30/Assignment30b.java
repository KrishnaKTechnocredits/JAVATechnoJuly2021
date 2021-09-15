package chandani.Assignment_30;

public class Assignment30b {

	int sum = 0;
	int isArmstrong(int num){
			
			int r;
			while(num > 0){
					r = num % 10;
				    int temp = r*r*r; 
					sum = sum + temp; 
					num = num/10;
			}
			System.out.println("Sum of cubes of given number is " + sum);
			return sum;
	}
	
	void displayArmstrongResult(int num){
		if(num == isArmstrong(num)){
			System.out.println(num + " is armstrong number");
		}else
			System.out.println(num + " is not a armstrong number");
	 }
	
	public static void main (String[] args){
		Assignment30b assignment30b = new Assignment30b();
		assignment30b.displayArmstrongResult(153);
		Assignment30b assignment30b1 = new Assignment30b();
		assignment30b1.displayArmstrongResult(121);
		Assignment30b assignment30b2 = new Assignment30b();
		assignment30b2.displayArmstrongResult(370);	
	} 
}
