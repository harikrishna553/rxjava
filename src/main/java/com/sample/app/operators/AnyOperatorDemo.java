package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class AnyOperatorDemo {
	public static void main(String args[]) {
		Observable.just(11, 2, 30, 4, 5).any(item -> item < 6)
				.subscribe(result -> System.out.println("Is any item < 6 " + result));
		
		Observable.just(11, 21, 31, 40, 51).any(item -> item < 6)
		.subscribe(result -> System.out.println("Is any items < 6 " + result));
	}
}

