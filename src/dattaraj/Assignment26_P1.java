package dattaraj;

public class Assignment26_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is technocredits";
		Assignment26_P1 p1 = new Assignment26_P1();
		p1.reverseStr(str);
	}

	void reverseStr(String str) {
		// TODO Auto-generated method stub
		char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }
	    
	    System.out.println("Reverse of "+ str + " is : " + rev);
	}

}
