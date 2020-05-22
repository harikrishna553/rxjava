package com.sample.app;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class EventsAtInterval {
	
	private static void sleep(int noOfSeconds) {
		try {
			Thread.currentThread().sleep(noOfSeconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {

		Observable<Long> data = Observable.interval(2, TimeUnit.SECONDS);

		data.subscribe(item -> System.out.println(item));
		
		sleep(20);
	}
}
