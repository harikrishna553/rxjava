package com.sample.app;

import io.reactivex.rxjava3.core.Single;

public class SingleItemObservableDemo {

	public static void main(String args[]) {
		Single<String> observable = Single.just("One");

		observable.subscribe(System.out::println, Throwable::printStackTrace);

	}

}
