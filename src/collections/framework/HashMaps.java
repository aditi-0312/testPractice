package collections.framework;

import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {

		HashMap<String, Integer> ids = new HashMap<>();
		// Types mentioned above have to be java classes(Wrapper classes) and not
		// primitive types e.g., int
		

		ids.put("Sue", 123);
		ids.put("Aditi", 1234);
		ids.put("Mariyam", 12345);
		System.out.println(ids);

		System.out.println(ids.get("Aditi"));
		System.out.println(ids.containsKey("Joe"));
		System.out.println(ids.containsValue(123));

		ids.put("Joe", 67);
		System.out.println(ids);
		// if Joe had already been present in the map "put" would've replaced its value
		// with the specified new one

		ids.replace("Carl", 1);
		System.out.println(ids);
		// replace does nothing if the specified key isn't present in the current map

		ids.putIfAbsent("Steve", 22);
		System.out.println(ids);

		ids.remove("Joe");
		System.out.println(ids);
	}

}
