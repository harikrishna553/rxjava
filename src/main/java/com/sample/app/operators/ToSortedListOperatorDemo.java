package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ToSortedListOperatorDemo {
	public static void main(String args[]) {
		Observable.just("a", "cat", "ball", "ant").toSortedList().subscribe(list -> {
			for (String s : list) {
				System.out.println(s);
			}
		});
	}
}