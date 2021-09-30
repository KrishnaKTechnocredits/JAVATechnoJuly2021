package dattaraj;

public class Assignment37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Welcome to the family";
		Assignment37 obj = new Assignment37();
		obj.sndLargeWord(input);

	}

	void sndLargeWord(String input) {
		// TODO Auto-generated method stub
		String [] output = input.split(" ");
		String maximum="";
		String secondMaximum ="";
		for(int index=0;index < output.length;index++) {
			if(output[index].length() > maximum.length()) {
				secondMaximum=maximum;
				maximum=output[index];
			}else if(output[index].length() > secondMaximum.length() && 
				output[index].length() != maximum.length() ) {
				secondMaximum=output[index];
			}
		}
		System.out.println("Second largest word is: "+secondMaximum);
	}
}
