package technocredits1;
class Test1{
	final double d;
	
	{
	}
	{
		d = 10.10;
	}
	
	Test1(){
		System.out.println(d);
		//d = 30.30; // CE
	}
	
	Test1(short s){
		//d = 20.20; // CE
	}
}