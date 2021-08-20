package tanmoy_Roy;

import java.io.*;
import java.util.*;

public class Assignment19_2 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");		//Hi@@Techno%^Credits___Hello 
        String s = scan.nextLine();
        String[] arr = s.split("[^A-Za-z]+");			//[^A-Za-z] means non alphabetical characters..+ means multiple occurrences
        int i=0,N=arr.length;
        
        String largestWord="";
        
        while(i<N) {
            if(arr[i].length()>largestWord.length())
            	largestWord=arr[i];
            i++;
            }
        	
        System.out.println("The Largest Word is : "+largestWord);
        scan.close();
    }
}