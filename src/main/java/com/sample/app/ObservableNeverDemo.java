package com.sample.app;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class ObservableNeverDemo {

	private static void sleep(int noOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {

		Observable<String> observable = Observable.never();

		observable.subscribe(new Observer<String>() {

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("I am subscribed");
			}

			@Override
			public void onNext(String t) {
				System.out.println("Received item : " + t);

			}

			@Override
			public void onError(Throwable e) {
				System.out.println("onError method is called\n");
				e.printStackTrace();
			}

			@Override
			public void onComplete() {
				System.out.println("Complete method is called");
			}

		});

		sleep(5);

	}

}
