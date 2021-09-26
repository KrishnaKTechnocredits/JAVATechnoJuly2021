package technocredits1.interviewQue;

public class Example2 {

	void printFreq(String str) {
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			int count = 0;
			for(int j=0;j<str.length();j++){
				if(str.charAt(j) == ch)
					count++;
			}
			if(count == 1)
				System.out.println(ch);
		} 
	}
	
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		example2.printFreq("technocredits");
	}
	
}
