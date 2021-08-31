package purshottamJoshi;

class Assignment25_2{
	int getSumOfNumber(String newstr) {
		int sum = 0;
		String str = "";
		for (int index = 0; index < newstr.length(); index++) {
			if (Character.isDigit(newstr.charAt(index))) {
				str += newstr.charAt(index);
				//System.out.println(": "+str);
			}else if (!str.equals("")){
				sum += Integer.parseInt(str);
				str = "";
			}
		}
		return sum;
	}
	public static void main(String[] args){
		Assignment25_2 assignment25_2 = new Assignment25_2();
		String str ="te12ch33no3credit4s";
		System.out.println("sum of numbers in string : "+assignment25_2.getSumOfNumber(str));
	}
}
