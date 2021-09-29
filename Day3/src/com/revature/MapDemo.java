package com.revature;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map isdCodes = new HashMap();

		isdCodes.put(1, "USA");
		isdCodes.put(91, "India");
		isdCodes.put(21, null);
		isdCodes.put(94, "SriLanka");
		isdCodes.put(null, "NoData");
		isdCodes.put(65, "Singapore");
		isdCodes.put(971, "UAE");
		isdCodes.put(94, "Pak");
		isdCodes.put(null, "Unknown");
		isdCodes.put(95, null);

		System.out.println(isdCodes);
	}
}
