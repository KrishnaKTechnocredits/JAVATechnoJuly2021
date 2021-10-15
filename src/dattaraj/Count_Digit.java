package dattaraj;

public class Count_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_Digit assignment40 = new Count_Digit();
		String str = "I have 15 years and 3 months of experience";
		System.out.println(str);
		System.out.print("Output : " );
		assignment40.getNumbersFromString(str);
	}

	 void getNumbersFromString(String str) {
		// TODO Auto-generated method stub
		String[] str_split = str.split(" ");
		
		for (int i = 0; i < str_split.length; i++) {
			try {
				int num = Integer.parseInt(str_split[i]);
				System.out.print(num+" ");
			} catch (NumberFormatException ne) {
				// TODO: handle exception
			}

		}
	}

}
