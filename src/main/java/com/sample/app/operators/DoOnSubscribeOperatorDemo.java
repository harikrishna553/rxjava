package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class DoOnSubscribeOperatorDemo {
	public static void main(String args[]) {
		Observable
			.just("One", "Two", "Three", "Four")
			.doOnSubscribe(disposable -> System.out.println("Subscribed : " + disposable))
			.subscribe(item -> System.out.println("Received: " + item));
	}
}