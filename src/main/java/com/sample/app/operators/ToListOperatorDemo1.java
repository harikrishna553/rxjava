package com.sample.app.operators;

import java.util.LinkedList;

import io.reactivex.rxjava3.core.Observable;

public class ToListOperatorDemo1 {
	public static void main(String args[]) {

		Observable.just("One", "Two", "Three").toList(3).subscribe(list -> {
			for (String s : list) {
				System.out.println(s);
			}
		});

		System.out.println();
		
		Observable.just("One", "Two", "Three").toList(LinkedList::new).subscribe(list -> {
			for (String s : list) {
				System.out.println(s);
			}
		});
	}
}
