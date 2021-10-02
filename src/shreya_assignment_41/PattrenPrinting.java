/*Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
******/
package shreya_assignment_41;

public class PattrenPrinting {
	void pattrenPrint() {
		for(int index=1;index<=5;index++) {
			for(int index1=1;index1<=index;index1++) {
				if(index%2==0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		PattrenPrinting pattrenPrinting=new PattrenPrinting();
		pattrenPrinting.pattrenPrint();

	}

}
