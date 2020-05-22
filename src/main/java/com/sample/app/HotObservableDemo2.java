package com.sample.app;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

public class HotObservableDemo2 {

	private static void sleep(int noOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(noOfSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static class ConsoleObserver implements Observer<String> {

		private String observerName;

		public ConsoleObserver(String observerName) {
			this.observerName = observerName;
		}

		@Override
		public void onSubscribe(Disposable d) {
			System.out.println(observerName + " subscribed");
		}

		@Override
		public void onNext(String t) {
			System.out.println(observerName + " received item : " + t);
			sleep(1);
		}

		@Override
		public void onError(Throwable e) {
			System.out.println(e.getMessage());
		}

		@Override
		public void onComplete() {
			System.out.println(observerName + " Complete method is called");
		}

	}

	public static void main(String args[]) throws InterruptedException {

		ConnectableObservable<String> observable = Observable.just("Value1", "Value2", "Value3").publish();

		observable.subscribe(new ConsoleObserver("Observer1"));
		observable.subscribe(new ConsoleObserver("Observer2"));
		observable.subscribe(new ConsoleObserver("Observer3"));

		Thread t1 = new Thread() {
			public void run() {
				observable.connect();
			}
		};

		t1.start();

		sleep(5);

		observable.subscribe(new ConsoleObserver("Observer4"));

	}
}
