/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5*/
package sagar_Anasane;

public class CodingTest8 {
	void countNoOfPairsFromSocksSizeArray(int[] arr) {
		int total=0;
		for(int index=0;index<arr.length;index++) {
			int count=1;
			for(int nIndex=index+1;nIndex<arr.length;nIndex++) {
				if(arr[index]==arr[nIndex]&&arr[index]!=0) {
					count++;
					arr[nIndex]=0;
				}
			}
			total = total +count/2;
		}
		System.out.println("Total count of Pairs from Socks Size Array : "+total);
	}
	
	public static void main(String[] args) {
		int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		CodingTest8 codingTest8= new CodingTest8();
		codingTest8.countNoOfPairsFromSocksSizeArray(input);
	}
}
