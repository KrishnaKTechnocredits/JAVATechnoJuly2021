

/* Assignment-41: Write a code to print below pattern *##***####*****   */
package somnath_Assignment_41;
class Assignment_41 {

	void printPattern(int input) {

		for (int index=1;index<=input;index++) {

			for(int index2=1;index2<=index;index2++) {

				if (index%2 != 0) {

					System.out.print("*");

				}else {

					System.out.print("#");
				}

			}	
			System.out.println(" ");
		}
		System.out.println("++++++++++++++++");
	}
	public static void main(String[] args) {

		Assignment_41 a = new Assignment_41();
		a.printPattern(10);
		a.printPattern(15);
	}

}