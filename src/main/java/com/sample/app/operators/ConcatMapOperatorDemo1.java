package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ConcatMapOperatorDemo1 {
	public static void main(String args[]) {
		Observable
			.just("Hello", "World")
			.concatMap(s -> Observable.fromArray(s.toUpperCase().split("")))
			.subscribe(item -> System.out.println(item));
	}

}
