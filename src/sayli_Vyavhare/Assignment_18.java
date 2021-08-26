package sayli_Vyavhare;

public class Assignment_18 {
	
	String reverse(String input) {
		String output="";
		for(int index=input.length()-1;index>=0;index--) {
			  output=output+ input.charAt(index);
		} 
		return output;
	}
	
	String[] reverseStringArray(String[] input) {

			for(int index=0;index<input.length;index++) {
				input[index]=reverse(input[index]);
		}
		return input;
	}
	
	public static void main(String[] args) {
	   String[] input= {"madhvi","surbhi","neha","sandesh","ankit","vaibhav"};
	   String[] input1= {"Techno","credits","krishna","harsh"};
	   
	  Assignment_18 assignment18=new Assignment_18();
	  assignment18.reverseStringArray(input);  
	  System.out.println("Reverse of elements at their place is:" );
	  	for(int index1=0;index1<=input.length-1;index1++) {
		  System.out.print(input[index1] + " ");
	  	}
	  System.out.println("\n"+"--------------------------------------");
	  assignment18.reverseStringArray(input1);  
	  System.out.println("Reverse of whole array :");
		for(int index=input1.length-1;index>=0;index--) {
			System.out.print(input1[index]+ " ");
		}
    }
}
