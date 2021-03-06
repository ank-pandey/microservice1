package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Max", "developer");
		Employee e2 = new Employee("Harry", "Sr developer");
		Employee e3 = new Employee("Kane", "Team Lead");
		Employee e4 = new Employee("Messi", "Architect");
		Employee e5 = new Employee("Ronaldo", "Manager");
		Map<String, Employee> map = new HashMap<>();
		
		map.put(e1.getName(), e1);
		map.put(e2.getName(), e2);
		map.put(e3.getName(), e3);
		map.put(e4.getName(), e4);
		map.put(e5.getName(), e5);
		
		System.out.println("hashCode of map is " + map.entrySet());
		System.out.println("size of map is " + map.size());

	}

}
