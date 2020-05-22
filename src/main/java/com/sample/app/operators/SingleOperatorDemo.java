package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class SingleOperatorDemo {
	public static void main(String args[]) {
		Observable
			.just("Hello")
			.single("No Item emitted from Source Observable")
			.subscribe(item -> System.out.println(item));
	}
}