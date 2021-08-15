/*  Print the following output : 
Maulik - 1
Maulik : 2
Maulik - 3
Maulik : 4

*/

package arti_K.Aarti_Practice;

public class ForloopExample4 {
	
	void print() {
		for(int index=1; index<5 ; index++) {
			String name = "Maulik";
			
			if(index % 2 ==0)
				System.out.println(name+" : "+index);
			else
				System.out.println(name+" - "+index);
		}
	}
	
	public static void main(String[] args) {
		ForloopExample4 exmaple4 = new ForloopExample4();
		exmaple4.print();
	}
}
