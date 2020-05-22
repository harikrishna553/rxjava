package com.sample.app;

import io.reactivex.rxjava3.core.Observable;

public class OperatorDemo {
	private static int index = 1;

	public static void main(String args[]) {

		Observable.create(emitter -> {
			emitter.onNext("First");
			emitter.onNext("Second");
			emitter.onNext("Third");
			emitter.onComplete();
		})
		.map(item -> ((String) item).toUpperCase())
		.map(item -> index++ + ". " + (String) item)
		.subscribe(item -> System.out.println(item));

	}
}


