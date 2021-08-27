package ankita;

public class Positivenumbers {
	
	static int count=0;
		int getPositivenum(int[] num) {
			
		for(int index=0;index<num.length;index++) {
			if(num[index]>0) 
				count++;
			}
			return count;
		}
					
		
	public static void main(String[] args) {
		int [] number= {1,-11,-44,23,55,-99,-23,-22};
		Positivenumbers positivenumbers=new Positivenumbers();
		positivenumbers.getPositivenum(number);
	    System.out.println("positive no are " + count);
		}
	}
