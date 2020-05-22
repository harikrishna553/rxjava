package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class SwitchIfEmptyDemo {
	public static void main(String args[]) {

		Observable<String> countryNamesObservable = Observable.just("Albania", "India", "Canada", "South Africa");

		Observable<String> countryNamesStartWithZ = Observable.just("Zimbabwe", "Zambia");

		countryNamesObservable.filter(countryName -> countryName.startsWith("Z")).switchIfEmpty(countryNamesStartWithZ)
				.subscribe(System.out::println);

	}

}
