package chirag.loopdemo;

public class Example7 {
	void display() {
				//System.out.println("number is dvisible by 3:- "+num);
		for(int index=1;index<=100;index++) {
			if(index>100)
				System.out.println("valid number");
			if(index%3==0  && index%5==0) {
			System.out.println(index);		
			}}
	}
	public static void main(String[] args) {
		Example7 example7=new Example7();
		example7.display();
	}

}

