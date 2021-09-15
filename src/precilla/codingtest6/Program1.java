package precilla.codingtest6;

public class Program1 {

	public static void main(String[] args) {
		String input="technocredits";
		Program1 program1=new Program1();
		System.out.println("Input : "+input);
		program1.getNonRepetatingWord(input);

	}

	private void getNonRepetatingWord(String input) {
		for(int index=0;index<input.length();index++) {
			if(input.indexOf(input.charAt(index))==input.lastIndexOf(input.charAt(index))) {
				System.out.println(input.charAt(index));
					break;
			}
		}
			
	}
		
}

