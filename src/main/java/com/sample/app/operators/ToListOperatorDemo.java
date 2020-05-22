package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ToListOperatorDemo {
	public static void main(String args[]) {

		Observable.just("One", "Two", "Three").toList().subscribe(list -> {
			for (String s : list) {
				System.out.println(s);
			}
		});
	}
}
