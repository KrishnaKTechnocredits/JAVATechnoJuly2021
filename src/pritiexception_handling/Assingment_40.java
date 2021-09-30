package pritiexception_handling;

public class Assingment_40 {
	void m1() {
		System.out.println("Ouput-1 : for numbers which are integer");
		System.out.println("Numbers  in the string are :");
		String input = "I have 15 years and 9 months of exp";
		String []str = input.split(" ");
		int num=0;
		int cnt =0;
		for (int index=0;index<str.length;index++) {
			try {
				num = Integer.parseInt(str[index]);
				System.out.println(str[index]);
				cnt++;
			}catch(NumberFormatException ne) {
				index++;
			}
		}
		System.out.println("Total Numbers in the string are :"+cnt);
	}
	
	
	void m2() {
		System.out.println("-----------------------------------------");
		System.out.println("Ouput-2 : Without using try catch");
		String str = "I have 15 years and 9 months of exp";
		int cnt=0;
		String output="";
		for (int index=0;index<str.length();index++) {
			char ch= str.charAt(index);
			if (Character.isDigit(ch)){
				//System.out.println(ch);
				cnt++;
				output = output+ch;
			}else if (output!="") {
				int num1=Integer.parseInt(output);
				System.out.println(num1);
				output="";
			}
		}
		System.out.println("Number of digits in the String are:"+cnt);
	}
	
	void m3() {
		System.out.println("-----------------------------------------");
		System.out.println("Ouput-3 : for numbers which are decimal");
		System.out.println("Numbers  in the string are :");
		String input = "I have 15.2 years of exp";
		String []str = input.split(" ");
		double num=0;
		int cnt=0;
		for (int index=0;index<str.length;index++) {
			try {
				num= Double.parseDouble(str[index]);
				System.out.println(str[index]);
				cnt++;
			}catch(NumberFormatException ne) {
				//index++;
			}
		}
		System.out.println("Total Numbers in the string are :"+cnt);
	}
	
	public static void main(String[] a) {
		Assingment_40 assingment_40= new Assingment_40();
		assingment_40.m1();
		assingment_40.m3();
		assingment_40.m2();
	}
	
}


/*Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3		 
		try{
			int num = Integer.parseInt(str[i]);
			sop(num);
		}
		catch(NumberFormatException ne){
		}
		
str = "I have 15.2 years of exp";
		Double.parseDouble();
*/