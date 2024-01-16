package com.javaproject.streams;

import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.javaproject.pojo.Book;

public class StreamConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//convert();
		Stream<Book> books = getBookStream();
		//long count = getCount(books);
		//System.out.println("Count --"+count);
		/*
		 * Optional<Book> bookMin = findMin(books); if(bookMin.isPresent()) {
		 * 
		 * System.out.println("Min--"+bookMin.get()); }
		 */
		Optional<Book> bookMax= findMax(books);
		if(bookMax.isPresent()) {
			
			System.out.println("Max--"+bookMax.get());
		}

	}

	
	public static void convert() {
		
		Stream<Book> books = getBookStream();
		//Object [] objectArray = books.toArray();
		Book[] bookArray = books.toArray(Book[]::new);
		for(int i=0;i<bookArray.length;i++) {
		System.out.println(bookArray[i]);
		}
		
	}
	
	public static <T> long getCount (Stream<T> stream) {
		
		long count = stream.count();
		return count;
	}
	
	public static Stream<Book> getBookStream(){
		
		Book lordOfRings = new Book("The lord of rings","JRR",70);
		Book harryPotter = new Book("Harry Potter","JRR",40);
		Book hobbit = new Book("Hobbit","JRR",50);
		Book davinciCode = new Book("Da Vinci Code","Dan Brown",20);
		Stream<Book> books = Stream.of(lordOfRings,harryPotter,hobbit,davinciCode);
		return books;
	}
	
	public static Optional<Book> findMin(Stream<Book> stream){

		Optional<Book> minElement = stream.min(Comparator.comparing(Book::getPrice));
		return minElement;
	}
	public static Optional<Book> findMax(Stream<Book> stream){

		Optional<Book> minElement = stream.max(Comparator.comparing(Book::getPrice));
		return minElement;
	}
}
