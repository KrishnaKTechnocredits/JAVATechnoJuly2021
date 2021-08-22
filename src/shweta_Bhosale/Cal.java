package shweta_Bhosale;
class Cal{
	int num1=2;
	int num2=5;
	
	//addition of 2 nbs:
	void add(int num1,int num2){
	int add = num1+num2;
	System.out.println("Addition of 2 no is: " +add);	
	}
	void sub(int num1, int num2){
	int sub = num1-num2;
	System.out.println("sub of 2 no is: " +sub);	
	}
	void mul(int num1,int num2){
	int mul = num1*num2;
		System.out.println("Mul of 2 nbr is: " +mul);
	}
	void div(int num1,int num2){
		int div= num1/num2;
		System.out.println("Div of 2 nbrs is: " + div);
	}
	public static void main (String [] ar){
	Cal cal=new Cal();
	
	cal.add(2,2);
	cal.sub(4,1);
	cal.div(8,2);
	cal.mul(5,3);
	}
}