


	/*Program 1: Write a method to reverse a given number.
				 input : 1932
				 output : 2391
	 Program 2: Verify whether given number is Armstrong number.
				input : 153
				output : 153 is an Armstrong number
	Q: what is Armstrong number ?
				ans : An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
	Program 3: Verify given number is an Palindrome number.
				input : 12321
				output : 12321 is an Palindrome number
				(Optional) Program 4 : verify given number is a perfect number or not.
				(Optional) Program 5 : verify given number is a perfect square.
	 			*/
package somnath.Assignment_30;
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
System.out.println(num + "IT IS ARMSTRONG NO.");
}else{
System.out.println(num + " IT IS NOT A ARMSTRONG NO.");
}
}
void isPallindrome(int num){
if(num==getReverseNumber(num)){
System.out.println(num + " IT IS PALLINDROME NO.");
}else{
System.out.println(num + " IT IS NOT PALLINDROME NO.");
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
System.out.println(input + " IT IS PERFECT NO.");
}else{
System.out.println(input + " IT IS NOT A PERFECT NO.");
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
System.out.println(input + " IT IS A PERFECT SQUARE NO.");
}else{
System.out.println(input + " IT'S NOT A PERFECT SQUARE NO.");
}
}
public static void main(String[] args){
Assignment_30 assignment_30=new Assignment_30();
System.out.println("REVERSE OF THE GIVEN NO. IS : " +assignment_30.getReverseNumber(1932));
assignment_30.getArmstrongNumber(153);
assignment_30.getArmstrongNumber(45);
assignment_30.isPallindrome(123321);
assignment_30.isPallindrome(84325);
assignment_30.isPerfectNumber(28);
assignment_30.isPerfectNumber(5);
assignment_30.isPerfectSquare(144);
assignment_30.isPerfectSquare(37);
assignment_30.isPerfectSquare(1936);
}
}

