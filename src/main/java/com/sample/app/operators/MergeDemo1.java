package com.sample.app.operators;

import java.util.Arrays;

import io.reactivex.rxjava3.core.Observable;

public class MergeDemo1 {
	public static void main(String args[]) {
		Observable<Integer> oddNumbers = Observable.just(1, 3, 5, 7);
		Observable<Integer> evenNumbers = Observable.just(2, 4, 6, 8);
		Observable<Integer> primeNumbers = Observable.just(2, 3, 5, 7);

		Observable
			.merge(Arrays.asList(oddNumbers, evenNumbers, primeNumbers))
			.subscribe(item -> System.out.println(item));

	}
}