package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class DistinctOperatorDemo {
	public static void main(String args[]) {
		Observable<String> observable = Observable.just("A", "B", "C", "D", "B", "E", "A", "E", "F");

		observable.distinct().subscribe(country -> System.out.println(country));

	}

}
