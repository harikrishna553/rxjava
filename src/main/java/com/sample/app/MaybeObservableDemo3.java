package com.sample.app;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;

public class MaybeObservableDemo3 {
	public static void main(String args[]) {

		Observable<String> observable = Observable.just("One", "Two", "Three");
		Maybe<String> maybeObservable = observable.firstElement();

		maybeObservable.subscribe(item -> System.out.println("Subscriber received: " + item),
				Throwable::printStackTrace, () -> System.out.println("Observable sent all the items"));

	}
}
