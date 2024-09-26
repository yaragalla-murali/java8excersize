package java8Excersize;

import java.util.Optional;

public class OptionalSol {
	
	 // Example 4: Null Check instead of Optional
    public static void handleOptionalJava7() {
        Person person1 = new Person("John");
        Person person2 = null;

        // Java 7: Null check
        System.out.println("Person 1's name (Java 7): " + getNameJava7(person1));
        System.out.println("Person 2's name (Java 7): " + getNameJava7(person2));
    }

    public static String getNameJava7(Person person) {
        if (person != null) {
            return person.getName();
        } else {
            return "Unknown";
        }
    }


	public static void main(String[] args) {
		Person person1 = new Person("John");
        Person person2 = null;
        
        System.out.println("Person 1's name (Java 8): " + getNameJava8(person1));
        System.out.println("Person 2's name (Java 8): " + getNameJava8(person2));
		 
		


	}
	
	 public static String getNameJava8(Person person) {
		 
		 Optional<Person> optPerson = Optional.ofNullable(person); 
		 return optPerson.isPresent()?optPerson.get().getName():"unknown";
	        
	    }


}
