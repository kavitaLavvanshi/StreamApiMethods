package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample {

	public static void main(String[] args) {
		System.out.println("The stream after applying "
                + "the function is : "); 

      // Creating a list of Strings 
       List<String> list = Arrays.asList("hello", "there", "Lavvanshikavita", 
                               "Computer", "Science", "kit"); 

      // Using Stream map(Function mapper) and 
      // displaying the length of each String 
          list.stream().map(str -> str.length()).forEach(System.out::println);

	}

}
