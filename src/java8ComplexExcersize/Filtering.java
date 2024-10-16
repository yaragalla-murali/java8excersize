package java8ComplexExcersize;

import java.util.ArrayList;
import java.util.List;

public class Filtering {

	public static void main(String[] args) {
		List<List<Integer>> numberGroups = new ArrayList<>();

        // List 1
        List<Integer> group1 = new ArrayList<>();
        group1.add(1);
        group1.add(2);
        group1.add(3);

        // List 2
        List<Integer> group2 = new ArrayList<>();
        group2.add(4);
        group2.add(5);
        group2.add(6);

        // List 3
        List<Integer> group3 = new ArrayList<>();
        group3.add(7);
        group3.add(8);
        group3.add(9);

        numberGroups.add(group1);
        numberGroups.add(group2);
        numberGroups.add(group3);
        
        numberGroups.stream().flatMap(list -> list.stream()).filter(a -> a%2==0 )
        			.forEach(System.out::println);
        


	}

}
