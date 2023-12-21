package com.stream.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Creating a stream directly from elements
        Stream<Integer> streamOfNum = Stream.of(1, 2, 3, 4, 5);
        
        
        // Creating a stream from an array
        String[] array = {"dog", "cat", "bird"};
        Stream<String> streamArr = Arrays.stream(array);
        
        // Creating a stream from a List
		List<String> myList = Arrays.asList("apple", "banana", "cherry");
		Stream<String> stream = myList.stream();
		
		// Use forEach to print each element of the stream
		streamOfNum.forEach(System.out::println);
	}

}
