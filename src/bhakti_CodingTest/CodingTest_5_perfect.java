/*Test 5 :
Find first 5 perfect numbers.*/

package bhakti_CodingTest;

public class CodingTest_5_perfect {
		void finNPerfectNumber(int n) {
			int count=0;
			int num=2;
			while (count<=n) {
				int sum=0;
				for(int i=1; i<num; i++) {
					if(num%i==0)
						sum+=i;
				}
				if (num==sum) {
					System.out.println(num);
					count++;
				}
				num++;
			}					
		}
		
		public static void main(String[] args) {
			CodingTest_5_perfect test_5Perfect= new CodingTest_5_perfect();
			test_5Perfect.finNPerfectNumber(5);
		}
}
