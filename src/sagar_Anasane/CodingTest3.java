/*Programming Test - 3
WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}

Branch name
YourName_codingtest_3*/
package sagar_Anasane;

public class CodingTest3 {
	void removeSpecificElementFromArray(int[] inp) {
		for(int index=0;index<inp.length;index++) {
			if(inp[index]==14) {
				for(int nIndex=index;nIndex<inp.length-1;nIndex++) {
					inp[nIndex]=inp[nIndex+1];
				}
			}
		}
		for(int index=0;index<inp.length-1;index++) {
			System.out.print(inp[index]+" ");
		}
	}
	public static void main(String[] args) {
		int[] input = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		CodingTest3 codingTest3 = new CodingTest3();
		codingTest3.removeSpecificElementFromArray(input);
	}
}
