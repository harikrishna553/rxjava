package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ElementAtErrorDemo {
	public static void main(String args[]) {
		Observable<String> observable = Observable.just("Albania", "Algeria", "India", "Canada", "Angola", "Burma",
				"Chile", "China");

		observable.elementAtOrError(5).subscribe(country -> System.out.println(country));

		System.out.println("\nTrying to acccess the element at index 10\n");

		observable.elementAtOrError(10).subscribe(country -> System.out.println(country),
				err -> System.out.println(err));

	}

}
