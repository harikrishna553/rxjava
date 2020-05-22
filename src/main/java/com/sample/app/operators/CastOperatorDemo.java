package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class CastOperatorDemo {
	public static void main(String args[]) {

		Observable<String> countryNamesObservable = Observable.just("Albania", "India");
		System.out.println("Casting String to Object type");
		countryNamesObservable.cast(Object.class).subscribe(country -> System.out.println(country));

		Observable<Integer> intIbservable = Observable.just(1, 2, 3);
		System.out.println("\nCasting Integer to Number type");
		intIbservable.cast(Number.class).subscribe(number -> System.out.println(number));

	}

}
