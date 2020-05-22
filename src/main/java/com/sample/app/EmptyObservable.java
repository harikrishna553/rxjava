package com.sample.app;

import io.reactivex.rxjava3.core.Observable;

public class EmptyObservable {
	public static void main(String args[]) {
		Observable.empty().subscribe(System.out::println, Throwable::printStackTrace,
				() -> System.out.println("I am done"));
	}
}
