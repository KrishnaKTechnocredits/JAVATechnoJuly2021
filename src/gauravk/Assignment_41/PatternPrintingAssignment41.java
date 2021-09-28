package gauravk.Assignment_41;
/*
 * Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
*****
 */
public class PatternPrintingAssignment41 {
	
	void patternPrinting(int n, char z, char z1) {
		char ch = z;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(ch);
			}
			System.out.println();
			if(ch==z)
				ch=z1;
			else ch=z;
		}
	}
	
	public static void main(String[] args) {
		PatternPrintingAssignment41 pattern = new PatternPrintingAssignment41();
		char c='*';
		char c1='#';
		int n=5;
		pattern.patternPrinting(n, c,c1);
	}
}
