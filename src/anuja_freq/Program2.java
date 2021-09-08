/*Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

package anuja_freq;

public class Program2 {

	String maxStr="";

	void display(String[] input) {
		int maxcount=0;
		for(int i=0;i<input.length;i++) { 
			int count=0;
			String str=input[i]; 
			for(int j=0;j<input.length;j++) {
				if(str==input[j] ) {
					count++;
					if(count>=maxcount) {	
						maxStr=str; 
						maxcount=count;
					}
				}
			}
		}
		System.out.println(maxStr+" -> "+maxcount);
	}
	
	public static void main(String[] args) {
		Program2 program2=new Program2();
		String[] input= {"Hi","Hello","Hi","Techno","Hello","Hi"};
		program2.display(input);
	}
}
