package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class DoAfterNextOperatorDemo {
	public static void main(String args[]) {
		Observable
			.just("One", "Two", "Three")
			.doAfterNext(s -> {System.out.println("Processing: " + s);})
			.map(String::toUpperCase)
			.subscribe(i -> System.out.println("Received: " + i));
	}
}

