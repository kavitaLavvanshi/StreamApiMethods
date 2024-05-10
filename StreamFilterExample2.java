package com.java8;

import java.util.stream.Stream;

public class StreamFilterExample2 {

	public static void main(String[] args) {
		// Creating a stream of strings 
        Stream<String> stream = Stream.of( 
            "Kavita", "Lavvanshi", "Lavvanshi", "Shi"); 
  
        // Getting a stream consisting of the 
        // elements having UpperCase Character 
        // at custom index say be it '1' 
        // using Stream filter(Predicate predicate) 
        stream 
            .filter( 
                str -> Character.isUpperCase(str.charAt(1))) 
            .forEach(System.out::println); 

	}

}
