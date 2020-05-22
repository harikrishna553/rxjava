package com.sample.app;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class ObservableRangeDemo {
	public static void main(String args[]) {

		Observable<Integer> observable = Observable.range(10, 20);

		observable.subscribe(new Observer<Integer>() {

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("I am subscribed");
			}

			@Override
			public void onNext(Integer t) {
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
