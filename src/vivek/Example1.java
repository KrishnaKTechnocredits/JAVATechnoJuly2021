package vivek;


public class Example1{
	int x=10;
	int y=20;
	
	void processData(){
		x=50;
		y=100;
	}
	
	void display(){
		System.out.println(x+y);
	}
		
	public static void main (String[] a){
		Example1 example1=new Example1();
		example1.processData();
		example1.display();
	}
}