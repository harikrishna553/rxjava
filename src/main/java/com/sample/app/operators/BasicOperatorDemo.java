package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Predicate;

public class BasicOperatorDemo {
	public static void main(String args[]) {
		Observable<String> observable = Observable.just("Hello", "How", "Are", "You", "Krishna");

		observable.map(s -> s.toUpperCase()).filter(new Predicate<String>() {

			@Override
			public boolean test(String item) throws Exception {

				if (item.length() > 4) {
					return false;
				}

				return true;
			}
		}).subscribe(item -> System.out.println("item : " + item));
	}

}


