package dattaraj;

import java.util.Scanner;

public class Assignment_20_P1 {
	void charFrequencies(String str) {
	   int[] freq = new int[str.length()];  
	   int i, j;  
	   char string[] = str.toCharArray();     
	       for(i = 0; i <str.length(); i++) {  
	           freq[i] = 1;  
	            for(j = i+1; j <str.length(); j++) {  
	                if(string[i] == string[j]) {  
	                    freq[i]++;  
	               	                      
	                    string[j] = '0';  
	                }  
	            }  
	       }   
	    System.out.println("Characters and their corresponding frequencies");  
	    for(i = 0; i <freq.length; i++) {  
	        if(string[i] != ' ' && string[i] != '0')  
	           System.out.println(string[i] + "-" + freq[i]);  
	     }  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_20_P1 assign20_P1 = new Assignment_20_P1();
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Word:");

	    String word = sc.nextLine();
	    assign20_P1.charFrequencies(word);
	    
	    sc.close();
	    
	}

}
