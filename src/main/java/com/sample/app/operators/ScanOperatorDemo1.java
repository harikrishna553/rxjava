package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ScanOperatorDemo1 {
	public static void main(String args[]) {

		Observable.just("Tomoto", "Mango", "Pineapple", "Sapota").scan(0, (accumulator, next) -> accumulator + 1)
				.subscribe(s -> System.out.println("Received Items: " + s));

	}
}
