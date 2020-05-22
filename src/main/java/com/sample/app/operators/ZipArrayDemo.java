package com.sample.app.operators;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

public class ZipArrayDemo {
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

		Observable.zipArray(new Function<Object[], Object>() {
			public Object apply(Object[] a) throws Exception {
				return a[0].toString() + " is " + a[1].toString() + " years old";
			}
		}, true, 3, names, ages).subscribe(item -> System.out.println(item));

		sleep(3);
	}
}

