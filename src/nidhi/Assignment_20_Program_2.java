package nidhi;

import java.util.Scanner;

class Assignment_20_Program_2{
	
	int countChar(String str, char ch){
		int cnt=0;
		for(int i=0;i<str.length();i++){
			if (str.charAt(i) == ch){
				cnt++;
			}
		}
		return cnt;
	}
	
	void countEachChar(String str){

		for(int i=0;i<str.length();i++){
			if (i == str.indexOf(str.charAt(i))) {
				countChar(str,str.charAt(i));
				System.out.println(str.charAt(i) + " : " + countChar(str,str.charAt(i)));
			}
		}
			
	}
	
	public static void main(String[] arg){
	Assignment_20_Program_2 assignment20 = new Assignment_20_Program_2();
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the String:");
	String text = scanner.next();
	//char ch = scanner.next().charAt(0);
	//System.out.println("The frequency of "+ ch + " in " + text + " is :" + assignment20.countChar(text,ch));
	assignment20.countEachChar(text);
	}
	
	
	
}