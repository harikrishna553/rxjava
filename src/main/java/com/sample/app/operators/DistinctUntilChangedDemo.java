package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class DistinctUntilChangedDemo {
	public static void main(String args[]) {
		Observable<String> observable = Observable.just("A", "A", "A", "B", "B", "A", "C", "B", "C");

		observable.distinctUntilChanged().subscribe(country -> System.out.println(country));

	}
}
