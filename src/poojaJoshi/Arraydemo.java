package poojaJoshi;

public class Arraydemo {

	public static void main(String[] args) {
		int [] num= new int [5];
		num [0] = 12;
		num[1] = 13;
		num[4]=20;
		num[3]=108;
		num[2]=300;
		
		System.out.println("Length of array is " + num.length);
		for (int index=0;index<=num.length;index++) {
		System.out.println(num[index]);
		}
	}
	
}
