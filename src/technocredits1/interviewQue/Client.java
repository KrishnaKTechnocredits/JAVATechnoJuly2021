package technocredits1.interviewQue;

public class Client {
	
	A m1(){
		return new B();
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		C temp = (C)client.m1();
		System.out.println();
		
	}
}
