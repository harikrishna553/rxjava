package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Predicate;

public class SkipWhileDemo {
	public static void main(String args[]) {
		Observable<String> observable = Observable.just("India", "Indonesia", "America", "Uganda", "France", "Ireland",
				"Iceland", "South Africa");

		System.out.println("Using skipWhile operator");
		observable.skipWhile(new Predicate<String>() {

			@Override
			public boolean test(String t) throws Exception {
				return t.startsWith("I");
			}

		}).subscribe(country -> System.out.println(country));

	}

}
