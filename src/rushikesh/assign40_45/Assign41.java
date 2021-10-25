package rushikesh.assign40_45;
  
//Assignment-41 : 28th Sep'2021  
//Write a code to print below pattern.
//
//*
//##
//***
//####
//*****

public class Assign41 {
	
	public static void main(String[] args) {
		Assign41 assign41 = new Assign41();
		assign41.printPattern();
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
