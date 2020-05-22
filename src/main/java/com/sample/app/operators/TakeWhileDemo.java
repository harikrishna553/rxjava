package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Predicate;

public class TakeWhileDemo {
	
	public static void main(String args[]) {
		Observable<String> observable = Observable.just("India", "Indonesia", "America", "Uganda", "France", "Ireland",
				"Iceland", "South Africa");

		observable.takeWhile(new Predicate<String>() {

			@Override
			public boolean test(String t) throws Exception {
				return t.startsWith("I");
			}

		}).subscribe(country -> System.out.println(country));
	}

}
