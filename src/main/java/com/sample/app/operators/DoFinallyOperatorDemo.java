package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class DoFinallyOperatorDemo {
	public static void main(String args[]) {
		Observable
			.just("One", "Two", "Three")
			.doFinally(() -> System.out.println("doFinally!"))
			.doOnComplete(() -> System.out.println("Completed emissions"))
			.subscribe(i -> System.out.println("Received: " + i));
	}
}