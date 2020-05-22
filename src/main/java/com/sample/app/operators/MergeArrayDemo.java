package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class MergeArrayDemo {
	public static void main(String args[]) {
		Observable<String> observable1 = Observable.just("One", "Two", "Three");
		Observable<String> observable2 = Observable.just("Four", "Five", "Six");
		Observable<String> observable3 = Observable.just("Seven");
		
		Observable
			.mergeArray(observable1, observable2, observable3)
			.subscribe(item -> System.out.println(item));
	}
}