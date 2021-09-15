package madhavi;

public class Coding_Test_2 {

	void getConversionCaseString(String str) {
		char[] outputarr = str.toCharArray();

		for (int index = 0; index < outputarr.length; index++) {

			if (Character.isUpperCase(outputarr[index])) {
				outputarr[index] = Character.toLowerCase(outputarr[index]);

			} else if (Character.isLowerCase(outputarr[index])) {
				outputarr[index] = Character.toUpperCase(outputarr[index]);

			}
		}
		System.out.println("Output:" + String.valueOf(outputarr));
	}

	public static void main(String[] args) {
		Coding_Test_2 coding_Test_2 = new Coding_Test_2();
		String str = "A1ashVi6";
		coding_Test_2.getConversionCaseString(str);

	}
}
