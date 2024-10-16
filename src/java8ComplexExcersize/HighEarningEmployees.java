package java8ComplexExcersize;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HighEarningEmployees {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 5000));
        employees.add(new Employee("Bob", 4000));
        employees.add(new Employee("Charlie", 6000));
        employees.add(new Employee("David", 4500));

        List<String>highSalEmpNames=employees.stream().filter(employee -> employee.salary >4500)
        .map(employee -> employee.name).collect(Collectors.toList());
        System.out.println(highSalEmpNames);

	}

}

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

