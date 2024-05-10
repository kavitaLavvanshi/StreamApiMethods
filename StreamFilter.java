package com.java8;

import java.util.*;  
import java.util.stream.Collectors;  
class B{  
    int id;  
    String name;  
    float price;  
    public B(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class StreamFilter {  
    public static void main(String[] args) {  
        List<B> productsList = new ArrayList<B>();  
        //Adding Products  
        productsList.add(new B(1,"HP Laptop",25000f));  
        productsList.add(new B(2,"Dell Laptop",30000f));  
        productsList.add(new B(3,"Lenevo Laptop",28000f));  
        productsList.add(new B(4,"Sony Laptop",28000f));  
        productsList.add(new B(5,"Apple Laptop",90000f));  
        List<Float> pricesList =  productsList.stream()  
                    .filter(p ->p.price> 30000)   // filtering price  
                    .map(pm ->pm.price)          // fetching price  
                    .collect(Collectors.toList());  
        System.out.println(pricesList);  
    }  
}  
