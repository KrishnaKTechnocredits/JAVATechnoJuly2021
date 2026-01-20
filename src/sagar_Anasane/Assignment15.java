/*Assignment 15 : 16th Aug'2021
program 1:  wap that will return difference of even length name and odd lenght name.
arr[0] = "Maulik";
arr[1] = "Techno";
arr[2] = "Nidhi";            	
arr[3] = "Ankit";
output : 2
program 2 : return middle char of all elements of the String array.
String[] str = {"hello","techno","credits"};
char charAt(int index){
}
Hint : charAt method of String class helps to retrieve character on given index
program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method.
int[] arr = {12,2,13,9}
hint : 22 - 14 = 8
output : 8
int[] arr = {13,22,10,3}
hint : 32 - 16 = 16
output : 16
*/
package sagar_Anasane;

public class Assignment15 {
	int even=0;
	int odd=0;
	int diffBetweenEvenLengthNameAndOddLengthName(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			if(arr[index].length()%2==0) {
				even+=arr[index].length();
			}else {
				odd+=arr[index].length();
			}
		}
		System.out.println("Difference Between Even Length Name and Odd Name Length :");
		System.out.println(even-odd);
		return even-odd;
		
	}
	void getMiddleCharacterOfAllStringArray(String[] str) {
		for(int index=0;index<str.length;index++) {
			int mid =str[index].length()/2;
			System.out.println("Middle Character of :"+str[index]+"->"+str[index].charAt(mid));
		}
		
	}
	void diffBetweenSumOfEvenNoAndSumOfOddNo(int[] num) {
		int sumeven=0;
		int sumodd=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]%2==0) {
				 sumeven+=num[index];
			}else
				sumodd+=num[index];
		}
		System.out.println("Difference Between Sum of Even no and Sum of Odd no");
		if(sumeven<sumodd) {
			System.out.println(sumodd-sumeven);
		}else {
			System.out.println(sumeven-sumodd);
		}
		//return even-odd;
		
	}
	public static void main(String[] args) {
		String[] arr = {"Maulik", "Techno","Nidhi","Ankit"};
		String[] str = {"hello","techno","credits"};
		int[] num = {12,2,13,9};
		int[] num1 = {13,22,10,3};
		Assignment15 assignment15= new Assignment15();
		assignment15.diffBetweenEvenLengthNameAndOddLengthName(arr);
		assignment15.getMiddleCharacterOfAllStringArray(str);
		assignment15.diffBetweenSumOfEvenNoAndSumOfOddNo(num);
		assignment15.diffBetweenSumOfEvenNoAndSumOfOddNo(num1);
		
		
	}
}
