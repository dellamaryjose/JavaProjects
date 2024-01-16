package com.javaproject.streams;

import java.util.stream.Stream;

import com.javaproject.pojo.Book;

public class StreamReducer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getSum());
	}

	
	public static int getSum() {
		
		
		Stream<Book> books = StreamConvertor.getBookStream();
		int sum = books.reduce(0,(cumulativeSum,book)->cumulativeSum+book.getPrice(),Integer::sum);
		return sum;
	}
}
