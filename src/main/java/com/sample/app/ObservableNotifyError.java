package com.sample.app;

import io.reactivex.rxjava3.core.Observable;

public class ObservableNotifyError {
	public static void main(String args[]) {

		boolean flag = true;

		Observable<String> observable = Observable.create(emitter -> {
			try {
				emitter.onNext("First");
				emitter.onNext("Second");

				if (flag)
					throw new RuntimeException("Error Occurred while emitting 3rd item");

				emitter.onNext("Third");
				emitter.onComplete();
			} catch (Exception e) {
				emitter.onError(e);
			}

		});

		observable.subscribe(s -> System.out.println("RECEIVED: " + s), Throwable::printStackTrace);
	}
}

