package com.javaproject.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.javaproject.pojo.Employee;

public class StreamFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPhoneNumbers());
	}

	
	public static Stream<Employee> getEmployeeStream(){
		
		Employee employee1 = new Employee(1, "Anu", Arrays.asList(3567899,668999));
		Employee employee2= new Employee(2, "Bindhu", Arrays.asList(13445678,54678));
		Employee employee3 = new Employee(3, "Sara", Arrays.asList(2365678,12345));
		Employee employee4 = new Employee(4, "Divya", Arrays.asList(78445678,118999));
		
		
		Stream<Employee> employeeStream = Stream.of(employee1,employee2,employee3,employee4);
		return employeeStream;
	}
	
	public static List<Integer> getPhoneNumbers(){
		
		List<Integer> phoneNumbers = getEmployeeStream()
				.flatMap(emp->emp.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		return phoneNumbers;
		
	}
}
