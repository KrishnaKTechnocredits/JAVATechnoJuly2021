package chirag.assignment25;

public class ArrangeStringInSortedForm {
	
	void StringInSortedForm(String input) {
		String upper = "";
		String lower = "";
		String number = "";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				upper = upper + ch;
			}
			if(Character.isLowerCase(ch)) {
				lower = lower + ch;
			}
			if(Character.isDigit(ch)) {
				number = number + ch;
			}
		}
		System.out.println(upper+number+lower);
	}
	public static void main(String[] args) {
		ArrangeStringInSortedForm arrangeStringInSortedForm=new ArrangeStringInSortedForm();
		String str = "Ma1U2liK";
		arrangeStringInSortedForm.StringInSortedForm(str);
	}

}
