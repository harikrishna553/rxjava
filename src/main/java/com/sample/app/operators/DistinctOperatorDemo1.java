package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class DistinctOperatorDemo1 {
	public static void main(String args[]) {
		Observable<String> observable = Observable.just("Albania", "India", "Algeria", "Angola", "Burma", "Canada",
				"Chile", "China");

		observable.distinct(String::length).subscribe(country -> System.out.println(country));

	}

}
