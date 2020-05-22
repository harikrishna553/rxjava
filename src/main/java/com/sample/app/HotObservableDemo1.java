package com.sample.app;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

public class HotObservableDemo1 {

	public static class ConsoleObserver implements Observer<String> {

		private String observerName;

		public ConsoleObserver(String observerName) {
			this.observerName = observerName;
		}

		@Override
		public void onNext(String t) {
			System.out.println(observerName + " received item : " + t);

		}

		@Override
		public void onError(Throwable e) {
			System.out.println(e.getMessage());
		}

		@Override
		public void onComplete() {
			System.out.println(observerName + " Complete method is called");
		}

		@Override
		public void onSubscribe(@NonNull Disposable d) {
			System.out.println(observerName + " subscribed");

		}

	}

	public static void main(String args[]) throws InterruptedException {
		ConnectableObservable<String> observable = Observable.just("One", "Two", "Three").publish();

		observable.subscribe(new ConsoleObserver("Observer1"));
		observable.subscribe(new ConsoleObserver("Observer2"));
		observable.subscribe(new ConsoleObserver("Observer3"));

		observable.connect();

	}
}
