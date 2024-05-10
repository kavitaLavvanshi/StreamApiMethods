package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		System.out.println("The stream after applying "
                + "the function is : "); 

// Creating a list of Integers 
    List<String> list = Arrays.asList("kavita", "Lavvanshi", "K", 
                               "a", "v", "i", "t"); 

   // Using Stream map(Function mapper) to 
  // convert the Strings in stream to 
  // UpperCase form 
   List<String> answer = list.stream().map(String::toUpperCase). 
   collect(Collectors.toList()); 

   // displaying the new stream of UpperCase Strings 
      System.out.println(answer); 

	}

}
