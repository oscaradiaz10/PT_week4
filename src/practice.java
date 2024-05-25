import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practice {
	
	public static void main(String[] args) {
		
		// List //
		// Unordered
		// Allows Duplicates
		// Keeps elements ordered by index
		// Allow  null values
		//Common implementations: ArrayList, LinkedList, Vector
		List<String> students = new ArrayList<>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null);
			
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println(students.get(2));
//		System.out.println(students.get(0));
		 
		//
		
		// Set //
		// Does not allow duplicates
		// Unordered
		// Allows null value
		// Common implementations: HashSet, LinkedHashSet, TreeSet
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add(null);
		
		System.out.println(states.size());
		//System.out.println(states.contains("State"));
		if (states.contains("Arizona")) {
			states.remove("Arizona");
		}
		
		
		for (String state : states) {
			System.out.println(state);
		}
		
		//
		
		// Map //
		// Key value pairs (dictionary)
		// Values can be duplicate, but no keys
		// Common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommmy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		
		//racerPlacements.remove(1); removes value
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values();
		
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "To make something greater by adding it; increase.");
		dictionary.put("Diminish", "Make or become less.");
		dictionary.put("Ostentacious", "Characterized by vulgar or pretentious display.");
		
		System.out.println(dictionary.size());
		
		// List of E where E is the generic that will be replaced with the type
		// List<String> reads as 'list of String'
		
//		List<String> sports = new ArrayList<String>();
//		sports.add("Wrestling");
//		sports.add("Soccer");
//		sports.add("Football");
//		//sports.remove(0); removes string
//		
//		for (int i = 0; i < sports.size(); i++) {
//			System.out.println(sports.get(i));
//		}
//		
//		for (String sport : sports) {
//			System.out.println(sport);
//		}
		
	}

}
