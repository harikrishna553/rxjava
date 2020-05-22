package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class StartWithItemDemo {
	public static void main(String args[]) {

		Observable<String> countryNamesObservable = Observable.just("Albania", "India", "Canada", "South Africa");

		countryNamesObservable.startWithItem("Country Names in my list").subscribe(System.out::println);

	}

}
