package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.GroupedObservable;

public class GroupByOperatorDemo {
	public static void main(String args[]) {
		Observable<String> countries = Observable.just("India", "Canada", "China", "Nepal", "Australia", "America",
				"Zimbabwe", "Angola");
		
		Observable<GroupedObservable<Integer, String>> countryNamesByLength = countries.groupBy(s -> s.length());
	
		countryNamesByLength
			.flatMapSingle(group -> group.toList())
			.subscribe(System.out::println);
		 
	}
}
