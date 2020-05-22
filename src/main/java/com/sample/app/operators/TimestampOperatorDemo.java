package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class TimestampOperatorDemo {
	public static void main(String args[]) {
		Observable
			.just("Log message 1", "Log message 2")
			.timestamp()
			.subscribe(item -> System.out.println(item.time() + " " + item.unit() + " " + item.value()));
	}
}