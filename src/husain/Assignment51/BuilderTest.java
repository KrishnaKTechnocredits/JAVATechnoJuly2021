package husain.Assignment51;

import java.util.Comparator;

public class BuilderTest implements Comparator<Builder> {

	@Override
	public int compare(Builder o1, Builder o2) {
		// TODO Auto-generated method stub
		return o1.revenue - o2.revenue;
	}

}
