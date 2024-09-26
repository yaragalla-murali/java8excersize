package java8Excersize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {
	
	// Example 2: Using Loop and Condition for Filtering Collections before java8
    public static void filterNamesJava7() {
        List<String> names = Arrays.asList("John", "Jane", "Tom", "Lucy");
        
        // Java 7: Loop and if statement for filtering
        List<String> filteredNamesJava7 = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("J")) {
                filteredNamesJava7.add(name);
            }
        }
        System.out.println("Filtered with Java 7: " + filteredNamesJava7);
    }


	public static void main(String[] args) {
		// java8 solution
		List<String> names = Arrays.asList("John", "Jane", "Tom", "Lucy");
		List<String> filteredList = names.stream().filter(a -> a.startsWith("J"))
									.collect(Collectors.toList());
		System.out.println(filteredList);
	}

}
