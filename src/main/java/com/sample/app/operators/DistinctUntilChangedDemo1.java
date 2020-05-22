package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class DistinctUntilChangedDemo1 {
	public static void main(String args[]) {
		Observable<String> observable = Observable.just("Albania", "Algeria", "India", "Canada", "Angola", "Burma",
				"Chile", "China");

		observable.distinctUntilChanged(String::length).subscribe(country -> System.out.println(country));

	}

}
