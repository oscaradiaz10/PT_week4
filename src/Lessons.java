import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lessons {

    private static List<String> returnValuesForKeysStartingWithA(Map<String, String> dictionary) {
        List<String> resultList = new ArrayList<>();
        Set<String> keySet = dictionary.keySet();
        for (String key : keySet) {
            if (key.toLowerCase().charAt(0) == 'a') {
                resultList.add(dictionary.get(key));
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        // Example usage
        Map<String, String> dictionary = Map.of(
            "Apple", "Fruit",
            "Banana", "Fruit",
            "Avocado", "Fruit",
            "Cherry", "Fruit",
            "apricot", "Fruit"
        );

        List<String> result = returnValuesForKeysStartingWithA(dictionary);
        System.out.println(result); // Output: [Fruit, Fruit, Fruit]
    }
}
