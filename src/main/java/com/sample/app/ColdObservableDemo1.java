package com.sample.app;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class ColdObservableDemo1 {

	private static void sleep(int noOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(noOfSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {

		Observable<String> data = Observable.just("One", "Two", "Three", "Four");

		data.subscribe(item -> {System.out.println("Observer 1: " + item); sleep(1);});
		data.subscribe(item -> {System.out.println("Observer 2: " + item); sleep(1);});
		data.subscribe(item -> {System.out.println("Observer 3: " + item); sleep(1);});
		
	}
}
