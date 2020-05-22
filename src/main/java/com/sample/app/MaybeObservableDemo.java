package com.sample.app;

import io.reactivex.rxjava3.core.Maybe;

public class MaybeObservableDemo {
	public static void main(String args[]) {

		Maybe<String> singleItemObservable = Maybe.just("One");
		Maybe<String> emptyObservable = Maybe.empty();

		singleItemObservable.subscribe(item -> System.out.println("Subscriber 1 received: " + item),
				Throwable::printStackTrace, () -> System.out.println("Observable1 sent all the items"));

		emptyObservable.subscribe(item -> System.out.println("Subscriber 2 received: " + item),
				Throwable::printStackTrace, () -> System.out.println("Observable2 sent all the items"));

	}

}
