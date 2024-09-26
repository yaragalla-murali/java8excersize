package java8Excersize;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	 // Example 1: Using Anonymous Classes for Sorting before java 8
    public static void sortNamesJava7() {
        List<String> names = Arrays.asList("John", "Jane", "Tom", "Lucy");
        
        // Java 7: Anonymous Comparator class
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Sorted with Java 7: " + names);
    }
   

    
    
    public static void main(String... args) {
    	// java 8 solution
    	List<String> names = Arrays.asList("John", "Jane", "Tom", "Lucy");
        List<String> sortedList=names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }


}
