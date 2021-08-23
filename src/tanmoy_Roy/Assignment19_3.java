package tanmoy_Roy;

import java.util.Scanner;

public class Assignment19_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");		//Hi@@Techno%^Credits___Hello 
        String s = scan.nextLine();
        String[] arr = s.split("[^A-Za-z]+");			//[^A-Za-z] means non alphabetical characters..+ means multiple occurrences
        int i=0,N=arr.length;
        
        String smallestWord=arr[0];
        
        while(i<N) {
            if(arr[i].length()<smallestWord.length())
            	smallestWord=arr[i];
            i++;
            }
        	
        System.out.println("The Largest Word is : "+smallestWord);
        scan.close();

	}

}
