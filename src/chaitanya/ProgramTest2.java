package chaitanya;

public class ProgramTest2 {
	
	void CaseChanger(String str) {
		String output = "";

		for (int index=0; index< str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				output= output+ Character.toLowerCase(ch);
			}
			else if (Character.isLowerCase(ch)) {
				output= output+ Character.toUpperCase(ch); 
			}
			else
				output = output + ch;
		}
		System.out.println("String : " + output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramTest2 programtest2 = new ProgramTest2();
		programtest2.CaseChanger("A1ashvi6");
	}

}
