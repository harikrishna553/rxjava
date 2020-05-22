package com.sample.app;

import java.util.Arrays;
import java.util.List;

import io.reactivex.rxjava3.core.Observable;

public class ObservableFromIterableDemo {
	public static void main(String args[]) {
		List<String> items = Arrays.asList("One", "Two", "Three", "Four");

		Observable<String> data = Observable.fromIterable(items);

		data.map(item -> item.toUpperCase()).subscribe(item -> System.out.println(item));
	}
}
