package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ConcatMapOperatorDemo {
	public static void main(String args[]) {
		Observable
			.just("Ram_21_Bangalore", "Krishna_31_Hyderabad", "Gopi_18_Chennai", "Sailaja_32_Amaravathi")
			.concatMap(s -> Observable.fromArray(s.split("_")))
			.subscribe(item -> System.out.println(item));
	}

}

