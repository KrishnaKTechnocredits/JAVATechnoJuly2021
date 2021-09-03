package gauravk.ScodingTest_2;
/*
 * Programming Test - 2 : 30th Aug 2021

Convert all lowercase to uppercase and uppercase to lowercase in a given string.

Input : A1ashVi6
Output : a1ASHvI6
 */

public class ChangeCaseInString {
	
	  String changeCase(String str1){
	    String s ="";
	    for(int i=0; i<str1.length(); i++){
	      char ch = str1.charAt(i);
	      if(Character.isAlphabetic(str1.charAt(i))){
	        if(Character.isLowerCase(str1.charAt(i))){
	          ch = Character.toUpperCase(str1.charAt(i));
	        }
	        else 
	        ch = Character.toLowerCase(str1.charAt(i));
	      }
	      s = s + Character.toString(ch); 
	    }
	    return s;
	  }
	  
	  public static void main(String[] args){
	    String str1 = "A1ashVi6";
	    //new Assignment_25_1().totalOfNumbers(str);
	    System.out.println("Case change of word, "+str1+" is: "+new ChangeCaseInString().changeCase(str1));
	  }
	}
