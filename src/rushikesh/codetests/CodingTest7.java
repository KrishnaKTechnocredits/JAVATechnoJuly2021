package rushikesh.codetests;
/*
Count the number of triplets in increasing order. [expected time : 10 mins]
input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25

 */
public class CodingTest7 {
	int getAscTriplet(int[] input) {
		int cnt=0;
		for(int i=0;i<input.length-2;i++) {
			if(input[i]<input[i+1] && input[i+1]<input[i+2]) {
				System.out.println("Triplet is "+input[i]+" "+input[i+1]+" "+input[i+2]);
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		CodingTest7 codingTest7=new CodingTest7();
		int []input = {10,9,11,6,23,25,22,66,34}; 
		int cnt=codingTest7.getAscTriplet(input);
		System.out.println("Trilpet Count is "+cnt);
	}
}
