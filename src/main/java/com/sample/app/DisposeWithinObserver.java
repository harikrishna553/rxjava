package com.sample.app;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class DisposeWithinObserver {
	public static class CustomObserver implements Observer<String> {

		private Disposable disposeable;
		private int maxitemsToReceive;
		private int receivedItems = 0;

		public CustomObserver(int maxitemsToReceive) {
			this.maxitemsToReceive = maxitemsToReceive;
		}

		@Override
		public void onSubscribe(Disposable disposeable) {
			this.disposeable = disposeable;
		}

		@Override
		public void onNext(String t) {
			receivedItems++;

			if (receivedItems > maxitemsToReceive) {
				System.out.println("Received " + maxitemsToReceive + " items and disposing the resource");
				disposeable.dispose();
				return;
			}
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
		Observable<String> observable = Observable.just("First", "Second", "Third", "Fourth");

		observable.subscribe(new CustomObserver(2));

	}

}