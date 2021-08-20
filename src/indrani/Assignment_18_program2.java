package indrani;

import java.util.Arrays;

     public class Assignment_18_program2{

      String getReverseString(String input){
	     String output="";
	     for(int index=input.length()-1;index>=0;index--){
		     output=output+input.charAt(index);
	        }
	        return output;
            }

       String[] getReverseArrayReverseOrder(String[] input){
	   String[] output=new String[input.length];
	   int n=input.length-1;
	   for(int index=0;index<=input.length-1;index++){
		     output[index]=getReverseString(input[n]);
		      n--;
	        }
	        return output;
            }

        public static void main(String[] args){
        	
	        Assignment_18_program2 program2=new Assignment_18_program2();
	        String[] input = {"techno", "credits", "krishna","harsh"};
	        String[] output=program2.getReverseArrayReverseOrder(input);
	        System.out.println("Reversed all elements of an array and placed it in a reverse order: ");
	        System.out.println(Arrays.toString(output));
}
} 