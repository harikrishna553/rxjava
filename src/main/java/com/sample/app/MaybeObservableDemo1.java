package com.sample.app;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;

public class MaybeObservableDemo1 {
	public static void main(String args[]) {

		Observable<String> singleItemObservable = Observable.just("One");
		Maybe<String> emptyObservable = Maybe.empty();

		singleItemObservable.subscribe(item -> System.out.println("Subscriber 1 received: " + item),
				Throwable::printStackTrace, () -> System.out.println("Observable1 sent all the items"));

		emptyObservable.subscribe(item -> System.out.println("Subscriber 2 received: " + item),
				Throwable::printStackTrace, () -> System.out.println("Observable2 sent all the items"));

	}
}
