package tanmoy_Roy;

import java.io.*;
import java.util.*;

public class Assignment19_1 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");		//Hi@@Techno%^Credits___Hello 
        String s = scan.nextLine();
        String[] arr = s.split("[^A-Za-z]+");			//[^A-Za-z] means non alphabetical characters..+ means multiple occurrences
        int i=0,N=arr.length;
        System.out.println("The count of words is "+N);
        scan.close();
    }
}
