package java8ComplexExcersize;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxAgeInEachCity {

	public static void main(String[] args) {
		class Person {
            String city;
            int age;

            Person(String city, int age) {
                this.city = city;
                this.age = age;
            }
        }

        List<Person> people = new ArrayList<>();
        people.add(new Person("New York", 30));
        people.add(new Person("New York", 45));
        people.add(new Person("San Francisco", 35));
        people.add(new Person("San Francisco", 50));

        Map map=people.stream().collect(Collectors.groupingBy(person -> person.city, Collectors.maxBy((person1,person2) ->person1.age < person2.age ? -1 : (person1.age > person2.age ? 1 : 0))));
        System.out.println(map);
	}

}
