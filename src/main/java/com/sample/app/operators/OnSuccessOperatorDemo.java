package com.sample.app.operators;

import io.reactivex.rxjava3.core.Maybe;

public class OnSuccessOperatorDemo {

	public static void main(String args[]) {

		Maybe
			.just("One")
			.doOnSuccess(i -> System.out.println("Emitting: " + i))
			.subscribe(item -> System.out.println("Subscriber 1 received: " + item));

	}

}