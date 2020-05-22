package com.sample.app;

import com.sample.app.ObserverDemo.CustomObserver;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class SubscribeDemo {
	public static class CustomObserver implements Observer<String> {

		@Override
		public void onSubscribe(@NonNull Disposable d) {
			System.out.println("Subscription request accepted : " + d);
		}

		@Override
		public void onNext(@NonNull String item) {
			System.out.println("Received Item : " + item);
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

		Observable<String> observable = Observable.just("One", "Two", "Three", "Four");

		observable.subscribe();
		System.out.println();

		observable.subscribe(item -> {
			System.out.println("Received Item : " + item);
		});
		System.out.println();

		observable.subscribe(item -> {
			System.out.println("Received Item : " + item);
		}, Throwable::printStackTrace);
		System.out.println();

		observable.subscribe(item -> {
			System.out.println("Received Item : " + item);
		}, Throwable::printStackTrace, () -> System.out.println("Observable finished with items"));
		System.out.println();

		observable.subscribe(new CustomObserver());

	}
}
