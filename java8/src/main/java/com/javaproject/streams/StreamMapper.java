package com.javaproject.streams;

import java.util.stream.Collectors;



import java.util.List;



public class StreamMapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMappedList());
	}
 
	
	public static List<Integer> getMappedList(){
		
		List<Integer> list = StreamConvertor.getBookStream().
				map(b-> b.getPrice()+10).collect(Collectors.toList());
		return list;
	}
}
