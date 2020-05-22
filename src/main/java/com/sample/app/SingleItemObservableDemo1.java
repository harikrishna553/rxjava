package com.sample.app;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class SingleItemObservableDemo1 {

	public static void main(String args[]) {
		Observable<String> observable = Observable.just("One", "Two", "Three");

		Single<String> singleObservable = observable.first("This is default value");

		singleObservable.subscribe(System.out::println, Throwable::printStackTrace);

	}

}
