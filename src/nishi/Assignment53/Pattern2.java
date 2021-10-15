/*2. WAP to print below pattern
       *
      * *
     * * *
    * * * *
   * * * * *
* */
package nishi.Assignment53;

public class Pattern2 {
	void pattern2(int num)
	  {	
		  for(int i=1;i<=num;i++)
		  {
			  for(int k=0;k<num-i;k++)
			  {
				  System.out.print(" ");
			  }
			  for(int j=1;j<=i;j++)
			  {
				  System.out.print("*"+" ");
				  
			  }
			  System.out.println();
		  }
	  }
	  public static void main(String[] args) {
		Pattern2 pattern=new Pattern2();
		pattern.pattern2(5);
	}
}
