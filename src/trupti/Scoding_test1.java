package trupti;

public class Scoding_test1 {

	public static void main(String[] args) {
		Scoding_test1 test=new Scoding_test1();
		String str="A1ashVi6";
		System.out.println("Input string: "+str);
		test.getUpperToLowerAndLowerToUpperString(str);
	}
	
	void getUpperToLowerAndLowerToUpperString(String str) {
		String input="";
		for(int index=0; index<str.length(); index++) {
			//char ch=str.charAt(index);
			if(Character.isUpperCase(str.charAt(index))) {
				input=input+Character.toLowerCase(str.charAt(index));
			}else if (Character.isLowerCase(str.charAt(index))) {
					input=input+Character.toUpperCase(str.charAt(index));
			}else
				input=input+str.charAt(index);
			
			}
			System.out.println("output string: "+input);
		}
	}

