package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class FilterDemo {
	public static void main(String args[]) {
		Observable<String> observable = Observable.just("Albania", "India", "Zambia", "Canada", "South Africa",
				"Zimbabwe");

		observable.filter(countryName -> countryName.startsWith("Z")).subscribe(System.out::println);
	}
}
