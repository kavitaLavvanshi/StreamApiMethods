package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;  
class C{  
    int id;  
    String name;  
    float price;  
    public C(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 

public class ConvertListIntoMap {

	public static void main(String[] args) {
	     List<C> productsList = new ArrayList<C>();
	     productsList.add(new C(1,"HP Laptop",25000f));  
	        productsList.add(new C(2,"Dell Laptop",30000f));  
	        productsList.add(new C(3,"Lenevo Laptop",28000f));  
	        productsList.add(new C(4,"Sony Laptop",28000f));  
	        productsList.add(new C(5,"Apple Laptop",90000f));  
	        
	        // Converting Product List into a Map  
	        Map<Integer,String> productPriceMap =   
	            productsList.stream()  
	                        .collect(Collectors.toMap(p->p.id, p->p.name));  
	              
	        System.out.println(productPriceMap);  

     
	}

}
