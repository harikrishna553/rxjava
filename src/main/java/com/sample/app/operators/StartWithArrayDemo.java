package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class StartWithArrayDemo {
	public static void main(String args[]) {

		Observable<String> countryNamesObservable = Observable.just("Albania", "India", "Canada", "South Africa");

		countryNamesObservable.startWithArray("Country Names", "--------------").subscribe(System.out::println);

	}

}
