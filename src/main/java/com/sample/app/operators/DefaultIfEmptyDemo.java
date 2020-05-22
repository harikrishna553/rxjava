package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class DefaultIfEmptyDemo {

	public static void main(String args[]) {

		Observable<String> countryNamesObservable1 = Observable.just("Zimbabwe", "Albania", "India", "Canada", "Zambia",
				"South Africa");

		Observable<String> countryNamesObservable2 = Observable.just("Albania", "India", "Canada");

		System.out.println("From Observable 1");
		countryNamesObservable1.filter(countryName -> countryName.startsWith("Z"))
				.defaultIfEmpty("No country name starts with z").subscribe(System.out::println);

		System.out.println("\n\nFrom Observable 2");
		countryNamesObservable2.filter(countryName -> countryName.startsWith("Z"))
				.defaultIfEmpty("No country name starts with z").subscribe(System.out::println);
	}

}
