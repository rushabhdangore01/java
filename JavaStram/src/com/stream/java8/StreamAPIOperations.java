package com.stream.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIOperations {
	
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("apple", "banana", "cherry");
		Stream<String> stream = myList.stream();

		//Intermediate Operations
		Stream<String> filteredStream = myList.stream().filter(s -> s.startsWith("b"));
		Stream<Integer> mappedStream = myList.stream().map(String::length);
		
		// Printing filteredStream
		System.out.println("Filtered Stream:");
		filteredStream.forEach(System.out::println);

		// Printing mappedStream
		System.out.println("Mapped Stream:");
		mappedStream.forEach(System.out::println);

	}

}
