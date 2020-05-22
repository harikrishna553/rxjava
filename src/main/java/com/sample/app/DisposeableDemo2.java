package com.sample.app;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

public class DisposeableDemo2 {
	public static void main(String args[]) throws InterruptedException {
		Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS);

		Disposable disposeable = observable.subscribe(item -> System.out.println(item));

		Thread.sleep(5000);

		if (!disposeable.isDisposed()) {
			System.out.println("Resource is not yet disposed");
		}

		disposeable.dispose();

		if (disposeable.isDisposed()) {
			System.out.println("Resource is disposed");
		}

	}

}
