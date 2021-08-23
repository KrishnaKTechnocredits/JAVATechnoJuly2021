package tanmoy_Roy;

import java.util.Scanner;

public class Assignment19_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Input :");		 
        String s = scan.nextLine();
        String[] arr = s.split("[^0-9]+");   ////[^0-9] means non numeric characters..+ means multiple occurrences
        int i=0,sum=0,N=arr.length;
        
        while(i<N) 
            	sum+=Integer.parseInt(arr[i++]);
        	
        System.out.println("Sum of Input Integers : "+sum);
        scan.close();

	}

}
