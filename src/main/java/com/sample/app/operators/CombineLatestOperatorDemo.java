package com.sample.app.operators;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class CombineLatestOperatorDemo {
	private static void sleep(int noOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(noOfSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Observable<Long> observable1 = Observable.interval(400, TimeUnit.MILLISECONDS);
		Observable<Long> observable2 = Observable.interval(1, TimeUnit.SECONDS);

		Observable
				.combineLatest(observable1, observable2, (item1, item2) -> "Observable 1: " + item1 + " Observable 2: " + item2)
				.subscribe(System.out::println);

		sleep(4);
	}

}
