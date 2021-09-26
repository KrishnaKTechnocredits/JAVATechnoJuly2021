package priti;

public class Assingment_19_4 {
	int sum=0;
	
	void getSum() {
		String input= "10 10 20 30";
		String[] str = input.split(" ");
		for (int index=0;index<str.length;index++) {
			int temp = Integer.parseInt(str[index]);
			sum = sum + temp;
		}	
		System.out.println(sum);
		
	}
	
	public static void main(String[] a) {
		Assingment_19_4 assingment_19_4 = new Assingment_19_4();
		assingment_19_4.getSum();
		
		
		
	}

}
