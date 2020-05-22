package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class MergeWithOperatorDemo {
	public static void main(String args[]) {
		Observable<String> observable1 = Observable.just("One", "Two", "Three");
		Observable<String> observable2 = Observable.just("Four", "Five", "Six");

		observable1
			.mergeWith(observable2)
			.subscribe(item -> System.out.println(item));
	}
}