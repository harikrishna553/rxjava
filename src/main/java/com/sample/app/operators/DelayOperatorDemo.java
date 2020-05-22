package com.sample.app.operators;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class DelayOperatorDemo {
	private static void sleep(int noOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(noOfSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		Observable
			.just(2, 3, 5, 7, 11)
			.delay(3, TimeUnit.SECONDS)
			.subscribe(item -> System.out.println(item));
		
		sleep(5);
	}

}