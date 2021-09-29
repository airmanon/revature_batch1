package com.revature;

import java.util.Optional;

public class OptionalClass {
	public Optional<String> getAmbiguousString(boolean b) {
		if (true) {
			return Optional.of("awesome string!");
		} else {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {
		OptionalClass obj = new OptionalClass();
		Optional<String> optString = obj.getAmbiguousString(true);
		//String theString = optString.orElse(""); // specify a fallback value
		System.out.println(optString.isEmpty());
		System.out.println(optString.get());
		// we can use the String without fear of NullPointerException now
	}
}
