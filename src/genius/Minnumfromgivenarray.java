package genius;

public class Minnumfromgivenarray {

	int getMinNumFromGivenArray(int[] input) {
		int minNum=input[0];
		for(int index=0;index<input.length;index++){
			if(input[index]<minNum) {
				minNum=input[index];
			}
		}
		return minNum;
	}
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		Minnumfromgivenarray minnumfromgivenarray = new Minnumfromgivenarray();
		System.out.println(minnumfromgivenarray.getMinNumFromGivenArray(input));
	}

}
