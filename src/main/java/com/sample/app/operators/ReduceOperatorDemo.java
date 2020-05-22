package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ReduceOperatorDemo {
	
	public static void main(String args[]) {
		Observable.just(1, 2, 3, 4, 5).reduce((accumulator, i) -> accumulator + i)
				.subscribe(sum -> System.out.println("Sum of Numbers from 1 to 5 : " + sum));
	}

}