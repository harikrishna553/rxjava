package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class DoOnCompleteOperatorDemo {
	public static void main(String args[]) {
		Observable
		.just("One", "Two", "Three")
		.doOnComplete(() -> System.out.println("All the items are transferred to observer"))
		.map(String::toUpperCase).subscribe(i -> System.out.println("Received: " + i));
	}
}