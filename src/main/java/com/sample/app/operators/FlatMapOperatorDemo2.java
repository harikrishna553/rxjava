package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class FlatMapOperatorDemo2 {
	public static void main(String[] args) {
		Observable
		.just("Hello")
		.flatMap(s -> Observable.fromArray(s.split("")), (s, r) -> s + " Mr." + r)
		.subscribe(System.out::println);
	}
}
