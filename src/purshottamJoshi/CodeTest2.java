package purshottamJoshi;
//String str = "te12ch33no3credit4s"
	//String str = "Ma1U2liK"
	//output : MUK12ali
class CodeTest2{
	String a="";
	String b="",c="";
	
	void m1(String newstr){
		for(int index=0; index < newstr.length(); index++){
			char ch = newstr.charAt(index);
			if(ch >=65 && ch <=91) {
				a=a+newstr.charAt(index);
			}if(ch >= 48 && ch <= 57)	{
				b=b+newstr.charAt(index);
			}if( ch >=97 && ch <= 128){
				c+=newstr.charAt(index);
				
			}
		}
		System.out.println(a+b+c);
		
	}
	
	
	public static void main(String[] args){
		String str = "Ma1U2liK";
		CodeTest2 codetest2 = new CodeTest2();
		codetest2.m1(str);
		
	}


}