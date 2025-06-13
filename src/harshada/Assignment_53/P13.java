package harshada.Assignment_53;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0)
				cnt = 0;
			else
				cnt = 1;
			for (int j = 1; j <= 5; j++) {
				System.out.print(cnt);
				if (cnt == 1)
					cnt = 0;
				else
					cnt = 1;

			}
			System.out.println();
		}
	}

}
