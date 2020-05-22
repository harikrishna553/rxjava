package com.sample.app;

import io.reactivex.rxjava3.core.Observable;

public class ObservableDeferDemo {
	private static int start = 10, count = 5;

	public static void main(String args[]) {

		Observable<Integer> observable = Observable.defer(() -> {
			System.out.println("I am in defer");
			return Observable.range(start, count);
		});

		observable.subscribe(time -> System.out.println("Observer1 : " + time));

		System.out.println();

		// Since every subscription creates new Observable, this count is reflects in
		// second observable.
		count = 8;

		observable.subscribe(time -> System.out.println("Observer2 : " + time));
	}

}
