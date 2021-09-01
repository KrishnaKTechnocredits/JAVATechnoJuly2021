/* Assignment25:-Program2:String str = "Ma1U2liK"
output : MUK12ali */
package santosh;
public class Assignment25_2 {

		void generateOrderedString(String input) {
			String upperCaseStr="";
			String lowerCaseStr="";
			String digitStr="";

			for(int index=0; index< input.length(); index++) {
				Character ch=input.charAt(index);
				if(Character.isUpperCase(ch)) {
					upperCaseStr=upperCaseStr+ch;
				}
				else {
					if(Character.isLowerCase(ch)) {
						lowerCaseStr=lowerCaseStr+ch;	
					}
					else {
						if(Character.isDigit(ch)) {
							digitStr=digitStr+ch;
						}
					}
				}
			}
			System.out.println("Ordered String is : " + upperCaseStr+digitStr+lowerCaseStr) ;
		}
		public static void main(String[] args) {
			Assignment25_2 assignment25_2=new Assignment25_2();
			assignment25_2.generateOrderedString("Ma1U2liK");
		}
}
