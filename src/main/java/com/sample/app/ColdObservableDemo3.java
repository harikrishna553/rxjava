package com.sample.app;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;

public class ColdObservableDemo3 {

	private static void sleep(int noOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(noOfSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {

			@Override
			public void subscribe(@NonNull ObservableEmitter<@NonNull Integer> emitter) throws Throwable {
				try {
					for (int i = 0; i < 10; i++) {
						if (emitter.isDisposed()) {
							System.out.println("Resource Disposed");
							return;
						}

						emitter.onNext(i);
						sleep(1);
					}
				} catch (Exception e) {
					emitter.onError(e);
				}

			}

		});

		Thread thread1 = new Thread() {
			public void run() {
				observable.subscribe(item -> System.out.println("Observer 1 : " + item));
				System.out.println("Observer 1 received all the items");
			}
		};

		Thread thread2 = new Thread() {
			public void run() {
				observable.subscribe(item -> System.out.println("Observer 2 : " + item));
				System.out.println("Observer 2 received all the items");
			}
		};

		thread1.start();
		sleep(2);
		thread2.start();

		sleep(15);

	}
}
