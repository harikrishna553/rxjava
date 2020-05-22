package com.sample.app.operators;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class ZipWithOperatorDemo {
	private static void sleep(int noOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(noOfSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Observable<String> names = Observable.just("Ram", "Rahim", "Joel");
		Observable<Integer> ages = Observable.just(31, 29, 35);

		names.zipWith(ages, (name, age) -> name + " is " + age + " years old")
				.subscribe(item -> System.out.println(item));

		sleep(3);
	}

}