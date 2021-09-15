package chandani.chandani_Coding_Test2;

public class CodingTest2{

	void printUpperLowerCase(String str) {
        for(int i=0;i<str.length();i++) {
            if(Character.isUpperCase(str.charAt(i))) {
            	char ch = Character.toLowerCase(str.charAt(i));
                System.out.print(ch);
            }
            else if(Character.isLowerCase(str.charAt(i))) {
            	char ch1 = Character.toUpperCase(str.charAt(i));
                System.out.print(ch1);
            }else if (Character.isDigit(str.charAt(i)))
            	System.out.print(str.charAt(i));
        }
    }
      
    void printUppertoLowerCase(String arr) {
    		System.out.println("Output is : ");
    		printUpperLowerCase(arr);
    }
		
    public static void main(String[] args) {
    	CodingTest2 codingTest2 = new CodingTest2();
        String arr= "A1ashVi6";
        System.out.println("Given String is : " + "\n" + arr);
        codingTest2.printUppertoLowerCase(arr);
    }
}

