package com.sample.app.operators;

import java.util.Arrays;

import io.reactivex.rxjava3.core.Observable;

public class StartWithIterableDemo {
	public static void main(String args[]) {

		Observable<String> countryNamesObservable = Observable.just("Albania", "India", "Canada", "South Africa");

		countryNamesObservable.startWithIterable(Arrays.asList("Country Names", "--------------"))
				.subscribe(System.out::println);

	}
}
