package husain.CodingTest_7;

public class NonRepeatingWord {

	String loopArray(String str) {

		String arr[] = str.split(" ");
		String output = "";
		int count = 1;
		boolean flag = true;

		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (flag)
					if (arr[index].equals(arr[innerIndex])) {
						count = 1;
						flag = true;
					} else {
						// output = arr[index];
						count = 0;
						continue;
						// break;
					}
				else
					flag = false;
				break;
			}
			if (count == 0) {
				output = arr[index];
				break;
			}
		}
		return output;
	}

	void display(String str) {
		System.out.println("The first non-repeating word is "+loopArray(str));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonRepeatingWord obj = new NonRepeatingWord();
		String str = "hi this is techno gm credits this hi is";
		obj.display(str);

	}

}
