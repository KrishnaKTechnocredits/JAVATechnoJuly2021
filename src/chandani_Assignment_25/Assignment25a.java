/* Assignment 25 : 29th Aug'2021

Program 2:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program 1:
String str = "Ma1U2liK"
output : MUK12ali */
package chandani_Assignment_25;

public class Assignment25a{

	void printUpperCase(String str) {
        for(int i=0;i<str.length();i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
    }
    
    void printLowerCase(String str) {
        for(int i=0;i<str.length();i++) {
            if(Character.isLowerCase(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
    }
    
    void printDigits(String str) {
        for(int i=0;i<str.length();i++) {
            if(Character.isDigit(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
    }
    
    void printUpperCaseFirst(String arr) {
    		System.out.println("Output is : ");
            printUpperCase(arr);
            printDigits(arr);
            printLowerCase(arr);         
    }

    public static void main(String[] args) {
    	Assignment25a assignment25a = new Assignment25a();
        String arr= "Ma1U2liKT";
        System.out.println("Given String is : " + "\n" + arr);
        assignment25a.printUpperCaseFirst(arr);
    }
}
