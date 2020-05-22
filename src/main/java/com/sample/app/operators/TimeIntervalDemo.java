package com.sample.app.operators;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class TimeIntervalDemo {
	private static void sleep(int noOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(noOfSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Observable
			.interval(2, TimeUnit.SECONDS)
			.timeInterval(TimeUnit.SECONDS)
			.subscribe(item ->  System.out.println(item.time() + " " + item.unit() + " " + item.value()));

		sleep(10);
	}

}