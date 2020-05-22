package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class MapOperatorDemo {
	public static void main(String args[]) {

		Observable<String> singleItemObservable = Observable.just("Albania", "India");

		System.out.println("Change the country names to upper case");
		singleItemObservable.map(country -> country.toUpperCase()).subscribe(country -> System.out.println(country));

		System.out.println("\nChange the country names to lower case");
		singleItemObservable.map(country -> country.toLowerCase()).subscribe(country -> System.out.println(country));

		System.out.println("\nPrint the length of strings");
		singleItemObservable.map(country -> country.length()).subscribe(country -> System.out.println(country));
	}
}
