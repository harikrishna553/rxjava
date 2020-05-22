package com.sample.app;

import java.io.IOException;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class ObservableErrorDemo {
	public static void main(String args[]) throws InterruptedException {

		Observable<String> observable = Observable.error(new IOException());

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

	}

}
