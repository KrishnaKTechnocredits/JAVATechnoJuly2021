/*Program2:
		String str = "Ma1U2liK"
		output : MUK12ali*/

package ashit_assignment_25;

public class Program_2 {
	void display(String str) {
				for(int i=0;i<str.length();i++) {
					char ch=str.charAt(i);
					if(Character.isUpperCase(ch)) {
						System.out.print(ch);
					}
				}
				for(int i=0;i<str.length();i++) {
					char ch=str.charAt(i);
					if(Character.isDigit(ch)) {
						System.out.print(ch);
					}
				}
				for(int i=0;i<str.length();i++) {
					char ch=str.charAt(i);
					if(Character.isLowerCase(ch)) {
						System.out.print(ch);
					}
				}
			}

			public static void main(String[] args) {
				String str = "Ma1U2liK";
				Program_2 program2=new Program_2();
				program2.display(str);
			}
		}


