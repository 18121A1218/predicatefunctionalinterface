package com.stackroute.lamdbaexpression;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctionalInterface {
    public List<String> findPattern(List<String> list) {
    	Predicate<String> startWithI = x -> x.startsWith("I");
    
    	List<String> items = list.stream().filter(startWithI).distinct().collect(Collectors.toList());
    
        return items;
    }
}