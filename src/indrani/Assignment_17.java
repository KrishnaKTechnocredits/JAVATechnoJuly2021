package indrani;

public class Assignment_17 {
      
	    String getReverseString(String input) {
	    	String str = "";
	    	char ch[]= input.toCharArray();
	    	for (int index=ch.length-1;index>=0;index--) {
	    		str = str+ch[index];
	    	}
	    	return str;
	    }
	    
	     public static void main(String[] args) {
	    	 Assignment_17 assignment_17 = new Assignment_17();
	    	 String input ="technocredits";
	    	 System.out.println(assignment_17.getReverseString(input));
	     }
}
