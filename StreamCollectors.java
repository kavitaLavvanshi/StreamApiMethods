package com.java8;

import java.util.*;  
import java.util.stream.Collectors;  
class D{  
    int id;  
    String name;  
    float price;  
    public D(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class StreamCollectors {  
    public static void main(String[] args) {  
        List<D> productsList = new ArrayList<D>();  
        //Adding Products  
        productsList.add(new D(1,"HP Laptop",25000f));  
        productsList.add(new D(2,"Dell Laptop",30000f));  
        productsList.add(new D(3,"Lenevo Laptop",28000f));  
        productsList.add(new D(4,"Sony Laptop",28000f));  
        productsList.add(new D(5,"Apple Laptop",90000f));  
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
          
    }  
}