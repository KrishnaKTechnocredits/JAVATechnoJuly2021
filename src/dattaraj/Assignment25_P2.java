package dattaraj;

public class Assignment25_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Ma1U2liK";
		Assignment25_P2 assign25_P2 = new Assignment25_P2();
		assign25_P2.getNewStr(input);

	}

	void getNewStr(String input) {
		// TODO Auto-generated method stub
		String capStr = "";
		String lowStr = "";
		String numstr ="";
		
		for (int i = 0; i<input.length(); i++) {
			if(Character.isUpperCase(input.charAt(i))){
				capStr = capStr + input.charAt(i);
			}else if(Character.isLowerCase(input.charAt(i))){
				lowStr = lowStr + input.charAt(i);
			}else if (Character.isDigit(input.charAt(i))) {
				numstr = numstr + input.charAt(i);
			} 
		}
		
		System.out.println("New String is "+ capStr + numstr + lowStr);
	}

}
