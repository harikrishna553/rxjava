package com.sample.app.operators;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class SkipOperatorDemo1 {
	public static void main(String args[]) throws InterruptedException {
		Observable<Long> observable = Observable.interval(250, TimeUnit.MILLISECONDS);

		observable.skip(2, TimeUnit.SECONDS).subscribe(data -> System.out.println(data));

		Thread.sleep(5000);
	}

}
