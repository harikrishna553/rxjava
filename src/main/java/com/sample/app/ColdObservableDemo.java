package com.sample.app;

import io.reactivex.rxjava3.core.Observable;

public class ColdObservableDemo {
	public static void main(String args[]) {

		Observable<String> data = Observable.just("One", "Two", "Three", "Four");

		data.subscribe(item -> System.out.println("Observer 1: " + item));
		data.subscribe(item -> System.out.println("Observer 2: " + item));
		data.subscribe(item -> System.out.println("Observer 3: " + item));
	}
}
