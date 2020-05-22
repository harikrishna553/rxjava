package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class CountOperatorDemo {
	public static void main(String args[]) {
		Observable.just("One", "Two", "Three").count()
				.subscribe(total -> System.out.println("Total item count : " + total));
	}
}
