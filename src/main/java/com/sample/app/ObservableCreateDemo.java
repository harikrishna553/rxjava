package com.sample.app;

import io.reactivex.rxjava3.core.Observable;

public class ObservableCreateDemo {
	public static void main(String args[]) {

		Observable<String> observable = Observable.create(emitter -> {
			emitter.onNext("First");
			emitter.onNext("Second");
			emitter.onNext("Third");
			emitter.onComplete();
		});

		observable.subscribe(s -> System.out.println("RECEIVED: " + s));
	}
}


