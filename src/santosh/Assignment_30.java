/*Program 1: Write a method to reverse a given number.
			      input : 1932
				  output : 2391
		Program 2: Verify whether given number is Armstrong number.
				input : 153
				output : 153 is an Armstrong number
				Q: what is Armstrong number ?
				ans : An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3*3 + 73 + 1*3 = 371.
		Program 3: Verify given number is an Palindrome number.
				input : 12321
				output : 12321 is an Palindrome number
				(Optional) Program 4 : verify given number is a perfect number or not.
				(Optional) Program 5 : verify given number is a perfect square.
				*/

package santosh;

class Assignment_30{
	int getReverseNumber(int input){
		int revNum=0;
		while(input>0){
			int num=input%10;
			revNum=revNum*10 + num;
			input=input/10;
		}
		return revNum;
	}
	void getArmstrongNumber(int input){
		int sum=0;
		int temp=0;
		int num=input;
		while(input>0){
			temp=input%10;
			sum=sum+(temp*temp*temp);
			input=input/10;
		}
		if(num==sum){
			System.out.println(num + " it is armstrong No.\n");
		}else{
			System.out.println(num + " it is not armstrong No.\n");
		}
	}
	void isPallindrome(int num){
		if(num==getReverseNumber(num)){
			System.out.println(num + " it is pallindrome no.\n");
		}else{
			System.out.println(num + " it is not pallindrome no.\n");
		}
	}
	void isPerfectNumber(int input){
		int sum=0;
		for(int num=1;num<input;num++){
			if(input%num==0){
				sum=sum+num;
			}
		}
		if(input==sum){
			System.out.println(input + " it is perfect no.\n");
		}else{
			System.out.println(input + " it is not perfect no.\n");
		}

	}
	void isPerfectSquare(int input){
		int temp=0;
		boolean flag=false;
		for(int num=1;num<input;num++){
			if(input%num==0 && ((num*num)==input)){
				flag=true;
				break;
			}else{
				flag=false;
			}
		}
		if(flag){
			System.out.println(input + " it's perfect square no.\n");
		}else{
			System.out.println(input + " it's not perfect square no.\n");
		}
	}
	public static void main(String[] args){
		Assignment_30 assignment_30=new Assignment_30();
		System.out.println("----------------------------------");												
		System.out.println("Reverse of the given no.is:" +assignment_30.getReverseNumber(1932));
		assignment_30.getArmstrongNumber(153);
		assignment_30.getArmstrongNumber(45);
		assignment_30.isPallindrome(123321);
		assignment_30.isPallindrome(84325);
		assignment_30.isPerfectNumber(28);
		assignment_30.isPerfectNumber(5);
		assignment_30.isPerfectSquare(144);
		assignment_30.isPerfectSquare(37);
		assignment_30.isPerfectSquare(1936);
		System.out.println("----------------------------------");
	}
}