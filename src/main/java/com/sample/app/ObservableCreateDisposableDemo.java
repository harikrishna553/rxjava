package com.sample.app;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.disposables.Disposable;

public class ObservableCreateDisposableDemo {
	private static Disposable disposable;

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
					for (int i = 0; i < 3; i++) {
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

		Thread thread = new Thread() {
			public void run() {
				disposable = observable.subscribe(item -> System.out.println("Observer 1 : " + item));
				System.out.println("Done Receiving items");
			}
		};

		thread.start();

		sleep(5);

		System.out.println("Disposing the Resource");
		disposable.dispose();

	}
}
