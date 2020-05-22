package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class IsEmptyOperatorDemo {

	public static void main(String args[]) {
		Observable.just(1).isEmpty().subscribe(item -> System.out.println("Returned : " + item));

		Observable.just(1, 3, 5, 7).filter(item -> item > 10).isEmpty()
				.subscribe(item -> System.out.println("Returned : " + item));
	}

}