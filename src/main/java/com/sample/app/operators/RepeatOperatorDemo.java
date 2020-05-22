package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class RepeatOperatorDemo {
	public static void main(String args[]) {
		Observable
			.just(2, 3, 5, 7, 11)
			.doOnSubscribe(d -> System.out.println("\nSubscribed"))
			.repeat(3)
			.subscribe(item -> System.out.println(item));
	}
}