package com.sample.app.operators;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class MergeVsConcat2 {
	private static void sleep(int noOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(noOfSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Observable<Long> observable1 = Observable.intervalRange(999, 5, 1, 2, TimeUnit.SECONDS);
		Observable<Long> observable2 = Observable.interval(1, TimeUnit.SECONDS);

		Observable.concat(observable1, observable2).subscribe(System.out::println);

		sleep(15);
	}
}
