package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Predicate;

public class TakeDemo1 {

	public static void main(String args[]) {
		Observable<String> observable = Observable.just("India", "America", "Indonesia", "Uganda", "France", "Ireland",
				"Iceland", "South Africa");

		observable.filter(new Predicate<String>() {

			@Override
			public boolean test(String countryName) throws Exception {
				return countryName.startsWith("I");
			}

		}).take(3).subscribe(country -> System.out.println(country));

	}

}
