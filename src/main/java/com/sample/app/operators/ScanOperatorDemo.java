package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ScanOperatorDemo {

	private static int i = 1;

	public static void main(String args[]) {
		Observable.just(1, 2, 3, 4, 5).scan((accumulator, i) -> accumulator * i)
				.subscribe(value -> System.out.println((i++) + "!=" + value));
		
		i = 1;
		
		System.out.println();
		
		Observable.just(1, 2, 3, 4, 5).scan((accumulator, i) -> accumulator + i)
		.subscribe(value -> System.out.println("Sum of Numbers from 1 to " + (i++) + " is " + value));
		
	}

}