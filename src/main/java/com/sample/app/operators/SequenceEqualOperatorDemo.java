package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class SequenceEqualOperatorDemo {
	public static void main(String args[]) {
		Observable<Integer> observable1 = Observable.just(2, 3, 5, 7);
		Observable<Integer> observable2 = Observable.just(2, 3, 5, 7);
		Observable<Integer> observable3 = Observable.just(2, 3, 5, 7, 11);

		Observable.sequenceEqual(observable1, observable2)
				.subscribe(result -> System.out.println("Is observable1 and observable2 emit same items : " + result));
		
		Observable.sequenceEqual(observable1, observable3)
		.subscribe(result -> System.out.println("Is observable1 and observable3 emit same items : " + result));

	}

}