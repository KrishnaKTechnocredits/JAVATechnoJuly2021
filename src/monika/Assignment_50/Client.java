package monika.Assignment_50;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class Client {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Builder b1 = new Builder("A1", "DER4423", 20, 310);
			Builder b2 = new Builder("C1", "FWER323", 35, 200);
			Builder b3 = new Builder("B1", "RER4344", 10, 300);
			Builder b4 = new Builder("D1", "WEE3432", 35, 200);
			Builder b5 = new Builder("E1", "FER4242", 40, 100);

			List<Builder> list = new ArrayList<Builder>();
			list.add(b1);
			list.add(b2);
			list.add(b3);
			list.add(b4);
			list.add(b5);
			Collections.sort(list);
			System.out.println(list);

		}

}
