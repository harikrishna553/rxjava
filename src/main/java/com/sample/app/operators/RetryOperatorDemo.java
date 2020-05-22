package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class RetryOperatorDemo {
	public static void main(String args[]) {
		Observable
		.just("5", "2", "4", "a0", "3", "7", "91", "oi")
		.map(i -> Integer.parseInt(i))
		.retry(3)
		.subscribe(i -> System.out.println("Received: " + i), e -> System.out.println("Received Error: " + e));

	}
}