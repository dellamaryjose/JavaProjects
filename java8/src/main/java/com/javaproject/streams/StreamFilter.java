package com.javaproject.streams;
import java.util.List;
import java.util.stream.Collectors;

import com.javaproject.pojo.Book;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFilteredList());

	}

	public static List<Book> getFilteredList(){
		
	List<Book> filteredList = StreamConvertor.getBookStream()
			.filter( b-> b.getPrice()>50).collect(Collectors.toList());	
	
	return filteredList;
		
	}
}
