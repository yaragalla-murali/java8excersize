package java8Excersize;

import java.util.Arrays;
import java.util.List;

public class PrintNames {
	
	//Solution before java8
	public static void printNamesJava7() {
        List<String> names = Arrays.asList("John", "Jane", "Tom", "Lucy");
        
        // Java 7: Traditional for-each loop
        System.out.println("Printing with Java 7:");
        for (String name : names) {
            System.out.println(name);
        }
    }


	public static void main(String[] args) {
		//java8 solution
		List<String> names = Arrays.asList("John", "Jane", "Tom", "Lucy");
		names.stream().forEach(System.out::println);

	}

}
