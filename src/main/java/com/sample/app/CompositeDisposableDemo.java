package com.sample.app;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

public class CompositeDisposableDemo {
	private static final CompositeDisposable disposables = new CompositeDisposable();

	public static class CustomObserver implements Observer<Long> {

		@Override
		public void onSubscribe(Disposable disposable) {
			disposables.add(disposable);
		}

		@Override
		public void onNext(Long t) {
			System.out.println("Received : " + t);
		}

		@Override
		public void onError(Throwable e) {
			e.printStackTrace();
		}

		@Override
		public void onComplete() {

		}

	}

	public static void main(String args[]) throws InterruptedException {
		ConnectableObservable<Long> observable = Observable.interval(1, TimeUnit.SECONDS).publish();

		observable.subscribe(new CustomObserver());
		observable.subscribe(new CustomObserver());
		observable.subscribe(new CustomObserver());

		observable.connect();

		Thread.sleep(5000);

		System.out.println("Disposing all observables");

		disposables.dispose();

	}

}
