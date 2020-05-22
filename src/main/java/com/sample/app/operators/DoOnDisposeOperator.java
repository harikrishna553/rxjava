package com.sample.app.operators;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;

public class DoOnDisposeOperator {
	
	private static void sleep(int noOfSeconds) {
		try {
			TimeUnit.SECONDS.sleep(noOfSeconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		LambdaObserver disp = (LambdaObserver) Observable.interval(1, TimeUnit.SECONDS)
			.doOnDispose(() -> System.out.println("Disposing the resources"))
			.subscribe(item -> System.out.println("Received: " + item));
		
		sleep(3);
		
		disp.dispose();
		
		sleep(2);
	}
}