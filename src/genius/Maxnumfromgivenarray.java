package genius;

public class Maxnumfromgivenarray {

	int getMaxNumFromGivenArray(int[] input) {
		int maxNum=input[0];
		for(int index=0;index<input.length;index++){
			if(input[index]>maxNum) {
				maxNum=input[index];
			}
		}
		return maxNum;
	}
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		Maxnumfromgivenarray maxnumfromgivenarray = new Maxnumfromgivenarray();
		System.out.println(maxnumfromgivenarray.getMaxNumFromGivenArray(input));
	}

}
