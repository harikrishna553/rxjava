package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ContainsOperatorDemo {
	public static void main(String args[]) {
		Observable.just(1, 3, 5, 7).contains(3).subscribe(item -> System.out.println("Returned : " + item));
		
		Observable.just(1, 3, 5, 7).contains(30).subscribe(item -> System.out.println("Returned : " + item));
	}
}


