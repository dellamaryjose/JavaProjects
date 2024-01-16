package com.javaproject.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createStream();
	}
	
	public static void createStream() {
		
		Stream<Integer> intStream = Stream.of(10,40,56,34,50);
		intStream.forEach(System.out::println);
		IntStream integerStream = IntStream.of(10,40,56,34,50);
		integerStream.forEach(System.out::println);
		IntStream rangeStream = IntStream.range(0, 10);
		rangeStream.forEach(System.out::println);
		Stream<String> stringStream = Stream.<String>builder()
				.add("A")
				.add("B")
				.build();
		stringStream.forEach(System.out::println);
	}

}
