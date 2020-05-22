package com.sample.app;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.core.Observable;

public class ObservableDeferDemo1 {
	public static void main(String args[]) throws InterruptedException {

		List<String> data = new ArrayList<>();
		data.add("Hello");
		data.add("World");

		Observable<String> observable = Observable.defer(() -> {
			return Observable.fromIterable(data);
		});

		observable.subscribe(item -> System.out.println("Observer1: " + item));

		System.out.println("\nAdding three more items to the sequence\n");

		data.add("How");
		data.add("Are");
		data.add("You");

		observable.subscribe(item -> System.out.println("Observer2: " + item));
	}

}
