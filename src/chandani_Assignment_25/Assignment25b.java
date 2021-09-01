package chandani_Assignment_25;

public class Assignment25b{


	int sum = 0;
	String temp = "";
	
	void getSumOfNumbersinString(String str) {
		
        for(int index = 0;index < str.length();index++) {
            char ch = str.charAt(index);
			if(Character.isDigit(ch)){
				temp += ch;
			}else if(temp != ""){
					sum = sum + Integer.parseInt(temp);
					temp = "";
			}
		}
		System.out.println("Sum of concatenated numbers in the String  "  + str + " is : " + "\n" + sum);
        }
    
   
    public static void main(String[] args) {
    	Assignment25b assignment25b = new Assignment25b();
        String arr= "te12ch33no3credit4s";
        assignment25b.getSumOfNumbersinString(arr);      
    }
}
