package java8ComplexExcersize;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByStringLength {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("elderberry");

        Map<Integer, List<String>> map=words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);
	}

}
