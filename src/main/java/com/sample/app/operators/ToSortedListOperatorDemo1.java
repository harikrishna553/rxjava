package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ToSortedListOperatorDemo1 {
	public static void main(String args[]) {
		Observable.just("a", "cat", "ball", "ant", "z", "bat")
				.toSortedList((str1, str2) -> ((Integer) str1.length()).compareTo(str2.length())).subscribe(list -> {
					for (String s : list) {
						System.out.println(s);
					}
				});
	}
}