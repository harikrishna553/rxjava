package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class FlatMapOperatorDemo1 {
	public static void main(String args[]) {
		Observable
			.just("Hello", "World")
			.flatMap(s -> Observable.fromArray(s.toUpperCase().split("")))
			.subscribe(item -> System.out.println(item));
	}
}
