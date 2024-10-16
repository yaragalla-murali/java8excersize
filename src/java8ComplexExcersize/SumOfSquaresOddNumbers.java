package java8ComplexExcersize;

import java.util.ArrayList;
import java.util.List;

public class SumOfSquaresOddNumbers {

	public static void main(String[] args) {
		 List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        numbers.add(6);
	        
	        
	        
	        int sumOfOddNumbers=numbers.stream().filter(a -> a%2 !=0)
	        		.mapToInt(a -> a*a).sum();
	        System.out.println("The sum of odd numbers = "+sumOfOddNumbers);


	}

}
