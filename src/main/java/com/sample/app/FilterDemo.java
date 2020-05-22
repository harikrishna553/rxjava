package com.sample.app;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class FilterDemo {
	private static void sleep(int noOfSeconds) {
		try {
			Thread.currentThread().sleep(noOfSeconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {

		Observable.interval(1, TimeUnit.SECONDS).filter(item -> item % 4 == 0)
				.subscribe(item -> System.out.println(item));

		while (true) {
			sleep(20);
		}

	}
}

