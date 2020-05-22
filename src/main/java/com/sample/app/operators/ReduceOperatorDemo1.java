package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ReduceOperatorDemo1 {
	public static void main(String args[]) {
		Observable.just(1, 2, 3, 4, 5).reduce("Concatenation:", (accumulator, i) -> accumulator + " " + i)
				.subscribe(result -> System.out.println(result));
	}
}


