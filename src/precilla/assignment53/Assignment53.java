package precilla.assignment53;

public class Assignment53 {
	void pattern1() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void pattern2() {
		for(int i=0;i<5;i++) {
			for (int k=5-i; k>1; k--)   
	        {  
	            System.out.print(" ");   
	        } 
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	void pattern4() {
		   int numOfRows=5, col, row, space = 1;  
	        space = numOfRows - 1;  
	        for (row = 1; row<= numOfRows; row++)  
	        {  
	            for (col = 1; col<= space; col++)  
	            {  
	                System.out.print(" ");  
	            }  
	            space--;  
	            for (col = 1; col <= 2 * row - 1; col++)  
	            {  
	                System.out.print("*");  
	            }  
	            System.out.println("");  
	        }  
	        space = 1;  
	        for (row = 1; row<= numOfRows - 1; row++)  
	        {  
	            for (col = 1; col<= space; col++)  
	            {  
	                System.out.print(" ");  
	            }  
	            space++;  
	            for (col = 1; col<= 2 * (numOfRows - row) - 1; col++)  
	            {  
	                System.out.print("*");  
	            }  
	            System.out.println("");  
	        }  
	        
	    }
	
	void pattern5() {
		for(int i=4;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void pattern6() {
		 for(int i=5; i>=0; i--)
	     {
	        for (int k=5-i; k>=1; k--)   
	        {  
	        	System.out.print(" ");   
	        }
	        for (int j=0; j<i; j++ )   
	        {   
	           System.out.print("* ");   
	        }   
	        System.out.println();
	    }
	}
	void pattern7() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void pattern8() {
		 int row, col, numOfRows = 5;       
	        
	        for (row=0; row<numOfRows; row++)   
	        {  
	            for (col=numOfRows-row; col>1; col--)   
	            {  
	                System.out.print(" ");   
	            }   
	            for (col=0; col<=row; col++ )   
	            {   
	                System.out.print("* ");   
	            }   
	            System.out.println();   
	        }
	        for(row=numOfRows-1; row>=0; row--)
	        {
	            for (col=numOfRows-row; col>=1; col--)   
	            {  
	                System.out.print(" ");   
	            }
	            for (col=0; col<row; col++ )   
	            {   
	                System.out.print("* ");   
	            }   
	            System.out.println();
	        }
	}
	void pattern9() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	void pattern11() {
		for(int i=5;i>0;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	void pattern12() {
		  for(int row=1;row<=5;row++)
	        {
	           	int num=row;
	            for(int col=0;col<row;col++)
	            {
	                System.out.print(num+" ");
	                num--;
	            }
	            System.out.println();
	        }
	}
	void pattern14() {
		char[] arr= {'A','B','C','D','E','F'};
		for(int i=0;i<6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		
	}
	void pattern13() {
		
		 int prevNum=0;
	        for(int i=1;i<=5;i++) 
	        {
				for(int j=1;j<=5;j++) 
				{
					if(prevNum==0)
					{
					    System.out.print("1");
					    prevNum=1;
					}
					else
					{
					    System.out.print("0");
					    prevNum=0;
					}
				}
				System.out.println();
			}
		
	}
	void pattern15() {
		 int index=0;
	        int[] nums={1,2,3,4,5,6,7,8,9};
	        char[] chars={'A','B','C','D','E','F','G','H','I','J'};
	        for(int i=1;i<=3;i++) 
	        {
				for(int j=1;j<=3;j++) 
				{
					System.out.print(nums[index]);
					System.out.print(chars[index]);
					index++;
				}
				System.out.println();
			}

	}
	void pattern16() {
		char[] arr= {'A','B','C'};
		char[] arr1= {'a','b','c','d'};
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				if(i%2==0)
					System.out.print(arr[j]);
				else
					System.out.print(arr1[j]);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Assignment53 assignment53=new Assignment53();
		System.out.println("Pattern 1");
		assignment53.pattern1();
		System.out.println();
		System.out.println("Pattern 2");
		assignment53.pattern2();
		System.out.println();
		System.out.println("Pattern 4");
		assignment53.pattern4();
		System.out.println();
		System.out.println("Pattern 5");
		assignment53.pattern5();
		System.out.println();
		System.out.println("Pattern 6");
		assignment53.pattern6();
		System.out.println();
		System.out.println("Pattern 7");
		assignment53.pattern7();
		System.out.println();
		System.out.println("Pattern 8");
		assignment53.pattern8();
		System.out.println();
		System.out.println("Pattern 9");
		assignment53.pattern9();
		System.out.println();
		System.out.println("Pattern 11");
		assignment53.pattern11();
		System.out.println();
		System.out.println("Pattern 12");
		assignment53.pattern12();
		System.out.println();
		System.out.println("Pattern 13");
		assignment53.pattern13();
		System.out.println();
		System.out.println("Pattern 14");
		assignment53.pattern14();
		System.out.println();
		System.out.println("Pattern 15");
		assignment53.pattern15();
		System.out.println();
		System.out.println("Pattern 16");
		assignment53.pattern16();
	}

}
