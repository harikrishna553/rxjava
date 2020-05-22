package com.sample.app;

import io.reactivex.rxjava3.core.Observable;

public class ObservableJustDemo {
	public static void main(String args[]) {
		Observable<String> data = Observable.just("One", "Two", "Three", "Four");

		data.map(item -> item.toUpperCase()).subscribe(item -> System.out.println(item));

	}
}
