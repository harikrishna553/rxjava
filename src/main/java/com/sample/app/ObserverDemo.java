package com.sample.app;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class ObserverDemo {

	public static class CustomObserver implements Observer<String> {

		@Override
		public void onSubscribe(@NonNull Disposable d) {
			System.out.println("Subscription request accepted : " + d);
		}

		@Override
		public void onNext(@NonNull String t) {
			System.out.println("Received Item : " + t);
		}

		@Override
		public void onError(@NonNull Throwable e) {
			System.out.println("Received Error : " + e);
		}

		@Override
		public void onComplete() {
			System.out.println("Observable finished with items");
		}

	}

	public static void main(String args[]) {

		Observable<String> data = Observable.just("One", "Two", "Three", "Four");

		data.map(item -> item.toUpperCase()).subscribe(new CustomObserver());

	}
}


