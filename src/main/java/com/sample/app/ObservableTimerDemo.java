package com.sample.app;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;

public class ObservableTimerDemo {
	public static void main(String args[]) {

		Observable<Long> breakFastTomer = Observable.timer(5, TimeUnit.SECONDS);

		breakFastTomer.blockingSubscribe(v -> System.out.println("Breakfast is ready!"));

	}

}
