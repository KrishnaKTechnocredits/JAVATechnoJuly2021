package trupti;

public class Assignment26_3_4 {
	
	public static void main(String[] args){
		System.out.println("=====Swaping using 3rd variable====");
		int x=30; 
		int y=20;
		System.out.println("values of variables are:"+x+","+y);
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swaping values are:"+x+","+y);
		
		System.out.println("=======Swaping without using 3rd variable=====");
		int a=10;
		int b=20;
		System.out.println("values of variables are:"+a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping values are:"+a+","+b);
		
		
		
		
		
		
		
	}
}
