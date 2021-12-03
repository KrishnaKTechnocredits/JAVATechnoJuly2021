package gauravk.Assignment_48;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class AadharCardGenerator {

	private String panCardNumber;
	private static Map<String, String> map = new HashMap<String, String>();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy-HH:mm:ss.SS");
	LocalDateTime now = LocalDateTime.now();

	public AadharCardGenerator(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	final String getAadharCardNumber() {
		if (!map.containsKey(panCardNumber))
			map.put(panCardNumber, panCardNumber + dtf.format(now));
		return map.get(panCardNumber);
	}
}