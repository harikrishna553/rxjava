package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class SortedOperatorDemo {
	
	public static void main(String args[]) {
		
		Observable<Integer> observable = Observable.just(2, 3, 5, 7, 1, 2, 4, 6);
		observable.sorted().subscribe(System.out::println);
		
	}

}
