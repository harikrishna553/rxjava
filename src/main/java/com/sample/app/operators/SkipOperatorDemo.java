package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class SkipOperatorDemo {

	public static void main(String args[]) {
		Observable<String> observable = Observable.just("India", "America", "Indonesia", "Uganda", "France", "Ireland",
				"Iceland", "South Africa");

		observable.skip(3).subscribe(country -> System.out.println(country));
	}
}
