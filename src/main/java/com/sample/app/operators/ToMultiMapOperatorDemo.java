package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class ToMultiMapOperatorDemo {
	public static void main(String args[]) {
		Observable.just("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten")
				.toMultimap(String::length).subscribe(map -> {

					System.out.println("Length\tValues");
					for (int id : map.keySet()) {
						System.out.println(id + "\t" + map.get(id));
					}

				});
	}
}