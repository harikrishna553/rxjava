package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class SingleOperatorDemo2 {
	public static void main(String args[]) {
		Observable
			.just("Hello", "A", "Ant", "Animal")
			.filter(item -> item.startsWith("A"))
			.single("No Item emitted from Source Observable")
			.subscribe(item -> System.out.println(item));
	}
}
