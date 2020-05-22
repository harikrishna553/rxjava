package com.sample.app.operators;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class AmbOperatorDemo {
	private static void sleep(int noOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(noOfSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Observable<String> observable1 = Observable.just("Observable1-item1", "Observable1-item2").delay(4, TimeUnit.SECONDS);
		Observable<String> observable2 = Observable.just("Observable2-item1", "Observable2-item2").delay(2, TimeUnit.SECONDS);
		Observable<String> observable3 = Observable.just("Observable3-item1", "Observable3-item2").delay(5, TimeUnit.SECONDS);
		
		Observable.amb(Arrays.asList(observable1, observable2, observable3)).subscribe(System.out::println);

		sleep(6);
	}
}
