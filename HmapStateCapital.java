package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HmapStateCapital {

	public static void main(String[] args) {
		Map<String, String> h = new HashMap<String, String>();
		h.put("Karnataka", "Bengaluru");
		h.put("Andhra Pradesh", "Amaravathi");
		h.put("West Bengal", "Kolkata");
		h.put("Goa", "Panaji");
		h.put("Tamilnadu", "Chennai");
		h.put("Maharashtra", "Mumbai");
		h.put("Odisha", "Bhubaneshwar");
		String state = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter State or Capital");
			state = sc.nextLine();

			Set<Entry<String, String>> entry = h.entrySet();
			for (Entry<String, String> e : entry) {
				if (e.getValue().equalsIgnoreCase(state)) {
					System.out.println(e.getKey());
				}
				if (e.getKey().equalsIgnoreCase(state)) {
					System.out.println(e.getValue());
				}
			}
		} while (state != "q");

	}
}
