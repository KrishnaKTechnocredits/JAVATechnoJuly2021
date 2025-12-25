package dattaraj.Assignment_53;

public class Assignment_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_53 pattern = new Assignment_53();
		System.out.println("Pattern 1");
		pattern.printPattern1(4);
		System.out.println();
		
		System.out.println("Pattern 2");
		pattern.printPattern2(4);
		System.out.println();
		
		System.out.println("Pattern 3");
		pattern.printPattern3(4);
		System.out.println();
		
		System.out.println("Pattern 4");
		pattern.printPattern4(4);
		System.out.println();
		
		System.out.println("Pattern 5");
		pattern.printPattern5(4);
		System.out.println();
		
		System.out.println("Pattern 6");
		pattern.printPattern6(4);
		System.out.println();
		
		System.out.println("Pattern 7");
		pattern.printPattern7(4);
		System.out.println();
		
		System.out.println("Pattern 8");
		pattern.printPattern8(4);
		System.out.println();
		
		System.out.println("Pattern 9");
		pattern.printPattern9(4);
		System.out.println();
		
		System.out.println("Pattern 10");
		pattern.printPattern10(4);
		System.out.println();
		
		System.out.println("Pattern 11");
		pattern.printPattern11(4);
		System.out.println();
		
		System.out.println("Pattern 12");
		pattern.printPattern12(4);
		System.out.println();
		
		System.out.println("Pattern 13");
		pattern.printPattern13(5,5);
		System.out.println();
		
		System.out.println("Pattern 14");
		pattern.printPattern14(4);
		System.out.println();
		
		System.out.println("Pattern 15");
		pattern.printPattern15(3,6);
		System.out.println();
		
		System.out.println("Pattern 16");
		pattern.printPattern16(4);

	}
	
	void printPattern1(int rows) {
		for(int index=1; index<=rows; index++) {
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	void printPattern2(int rows) {
		for(int index=1; index<=rows; index++) {
			for(int index3=rows-index; index3>=1; index3--) {
				System.out.print(" ");
			}
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void printPattern3(int rows) {
		for(int index=1; index<=rows; index++) {
			for(int index3=1; index3<=rows-index; index3++) {
				System.out.print(" ");
			}
			for(int index2=1; index2<=index; index2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void printPattern4(int rows) {
		for(int index=1; index<=rows; index++) {
			for(int index3=rows-index; index3>=1; index3--) {
				System.out.print(" ");
			}
			for(int index2=1; index2<=index; index2++) {
				if(index%2 != 0)
					System.out.print("* ");
			}
			System.out.println();
		}
		for(int index=rows-1; index>=1; index--) {
			for(int index3=rows-index; index3>=1; index3--) {
				System.out.print(" ");
			}
			for(int index2=1; index2<=index; index2++) {
				if(index%2 != 0)
					System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void printPattern5(int rows) {
		for(int index=rows; index>=1; index--) {
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void printPattern6(int rows) {
		for(int index=rows; index>=1; index--) {
			for(int index3=rows-index; index3>=1; index3--) {
				System.out.print(" ");
			}
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void printPattern7(int rows) {
		for(int index=1; index<=rows; index++) {
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int index=rows-1; index>=1; index--) {
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void printPattern8(int rows) {
		for(int index=1; index<=rows; index++) {
			for(int index3=rows-index; index3>=1; index3--) {
				System.out.print(" ");
			}
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int index=rows-1; index>=1; index--) {
			for(int index3=rows-index; index3>=1; index3--) {
				System.out.print(" ");
			}
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void printPattern9(int rows) {
		for(int index=1; index<=rows; index++) {
			int count = 1;
			for(int index2=1; index2<=index; index2++) {
				System.out.print(count + " ");
				count ++;
			}
			System.out.println();
		}
	}
	
	void printPattern10(int rows) {
		for(int index=1; index<=rows; index++) {
			int count =1;
			for(int index3=1; index3<=rows-index; index3++) {
				System.out.print(" ");
			}
			for(int index2=1; index2<=index; index2++) {
				System.out.print(count);
				count ++;
			}
			System.out.println();
		}
	}
	
	void printPattern11(int rows) {
		for(int index=1; index<=rows; index++) {
			int count = rows;
			for(int index2=1; index2<=index; index2++) {
				System.out.print(count + " ");
				count --;
			}
			System.out.println();
		}
	}
	
	void printPattern12(int rows) {
		for(int index=1; index<=rows; index++) {
			for(int index2=index; index2>=1; index2--) {
				System.out.print(index2 + " ");
			}
			System.out.println();
		}
	}
	
	void printPattern13(int rows, int columns) {
		int cnt = 0;
		for(int index=1; index<=rows; index++) {
			if(index%2 != 0) {
				cnt = 1;
			}
			else {
				cnt = 0;
			}
			for(int index2=1; index2<=columns; index2++) {
				System.out.print(cnt + " ");
				if(cnt == 1) {
					cnt = 0;
				}
				else {
					cnt = 1;
				}
			}
			System.out.println();
		}
	}
	
	void printPattern14(int rows) {
		for(int index=1; index<=rows; index++) {
			char ch = 'A';
			for(int index2=1; index2<=index; index2++) {
				System.out.print(ch);
				ch = (char) (ch + 1);
			}
			System.out.println();
		}
	}
	
	void printPattern15(int rows, int columns) {
		int cnt = 1;
		int alphabet = 65;
		for(int index=1; index<=rows; index++) {
			for(int index2=1; index2<=rows; index2++) {
				System.out.print(cnt);
				System.out.print((char)(alphabet + cnt));
				cnt ++;
			}
			System.out.println();
		}
	}
	
	void printPattern16(int rows) {
		int uppercase = 64;
		int lowercase = 96;
		for(int index=1; index<=rows; index++) {
			for(int index2=1; index2<=index; index2++) {
				if(index%2 != 0)
					System.out.print((char)(uppercase + index2));
				else
					System.out.print((char)(lowercase + index2));
			}
			System.out.println();
		}
	}
	
}
