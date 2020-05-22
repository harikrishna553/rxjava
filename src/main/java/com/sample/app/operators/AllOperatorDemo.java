package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class AllOperatorDemo {
	public static void main(String args[]) {
		Observable.just(1, 2, 3, 4, 5).all(item -> item < 6)
				.subscribe(result -> System.out.println("Is all items are < 6 " + result));
		
		Observable.just(1, 21, 31, 4, 5).all(item -> item < 6)
		.subscribe(result -> System.out.println("Is all items are < 6 " + result));
	}
}


