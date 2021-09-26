package technocredits1.interviewQue;

public class Example5 {

	public static void main(String[] args) {
		char maxChar = ' ';
		int maxCount = 0;
		
		String str = "technocredits";
		while(str.length()>0) {
			char ch = str.charAt(0);
			int oL = str.length();
			str = str.replace(String.valueOf(ch), "");
			System.out.println(str);
			int nL = str.length();
			int count = oL - nL;
			if(maxCount < count) {
				maxCount = count;
				maxChar = ch;
			}
		}
		System.out.println(maxChar + ":" + maxCount);
	
	}
}
