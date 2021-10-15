package dattaraj;

public class Print_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print_Pattern print = new Print_Pattern();
		print.printPattern();
	}

	public void printPattern() {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++){
			for(int j=0;j<=i;j++){
				if(i%2==0){
					System.out.print("*");
				}else{
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}
