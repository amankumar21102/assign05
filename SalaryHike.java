package com.elemica.supply.chain.assign01;

import java.util.*;
import java.util.stream.Collectors;

public class SalaryHike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Staff> staffList = new ArrayList<>();
	        staffList.add(new Staff(1, "John", 60000, "HR"));
	        staffList.add(new Staff(2, "Alice", 45000, "Finance"));
	        staffList.add(new Staff(3, "Bob", 70000, "HR"));
	        staffList.add(new Staff(4, "Mike", 55000, "IT"));
	        staffList.add(new Staff(5, "Carol", 52000, "Finance"));

	        // List staff with salary > 50000
	        System.out.println("Staff with salary > 50000:");
	        staffList.stream()
	                 .filter(s -> s.getSalary() > 50000)
	                 .forEach(System.out::println);

	        // Get names of staff in HR department
	        System.out.println();
	        System.out.println("Staff in HR Department:");
	        List<String> hrNames = staffList.stream()
	                                        .filter(s -> "HR"==(s.getDepartment()))
	                                        .map(Staff::getName)
	                                        .collect(Collectors.toList());
	        hrNames.forEach(System.out::println);

	        // Count staff by department
	        System.out.println();
	        System.out.println("Count by Department:");
	        Map<String, Long> countByDept = staffList.stream()
	                                                 .collect(Collectors.groupingBy(Staff::getDepartment, Collectors.counting()));
	        countByDept.forEach((dept, count) -> System.out.println(dept + ": " + count));

	        // Increase salary by 10%
	        System.out.println();
	        System.out.println("After 10% Salary Increase:");
	        staffList.forEach(s -> s.salary *= 1.10);
	        staffList.forEach(System.out::println);

	        // Sort staff by salary descending
	        System.out.println();
	        System.out.println("Sorted by Salary (Descending):");
	        staffList.stream()
	                 .sorted((s1, s2) -> Double.compare(s2.getSalary(), s1.getSalary()))
	                 .forEach(System.out::println);
	    }

	}

