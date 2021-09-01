package rushikesh.stringmethods;

public class ArrangeOrder {
	String getCapFirst(String str) {
		String capLetter="";
		String smaLetter="";
		String num="";
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
				if(Character.isUpperCase(ch)) {
					capLetter+=ch;
				}else if(Character.isLowerCase(ch)) {
					smaLetter+=ch;
				}else {
					num+=ch;
				} 	
		}
		return capLetter+num+smaLetter;	
	}
	
	public static void main(String[] args) {
		ArrangeOrder arrangeOrder=new ArrangeOrder();
		String str = "Ma1U2liK";
	    System.out.println(arrangeOrder.getCapFirst(str));
	}
}
//String str = "Ma1U2liK"
//output : MUK12ali
