package laxman;

public class Assignment25 {
	
	void sumDigits() {
	String str = "te12ch33no3credit4s"; 
	//output = 12+33+3+4
	int sum=0;
	
	for(int i=0;i<str.length();i++) {
		String s="0";
		while(str.charAt(i)>=48 && str.charAt(i)<=57) {
			s=s+str.charAt(i);
			i++;
	}
		sum=sum+Integer.parseInt(s);
	}		
	System.out.println(sum);			
	}
	 void reArrangeCaps(String str) {
		
      //output : MUK12ali
		String upper="";
		String lower="";
		String digit ="";
		
	for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) 
				upper+= ch;
			else if(Character.isDigit(ch))
				lower+=ch;
			else if(Character.isLowerCase(ch))
				digit+=ch;
				
			}
			System.out.println(upper+lower+digit);
		}
		
	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		assignment25.sumDigits();
		assignment25.reArrangeCaps("Ma1U2liK");
		
	}

}
