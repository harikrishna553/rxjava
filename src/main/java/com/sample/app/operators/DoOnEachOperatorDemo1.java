package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class DoOnEachOperatorDemo1 {
	public static void main(String args[]) {
		Observable
			.just("5", "2", "4", "a0", "3", "7", "91", "oi")
			.map(i -> Integer.parseInt(i))
			.doOnEach(notification -> {
        	 	System.out.println("doOnEach: " + notification);
        	 	System.out.println("\tError: " + notification.getError());
        	 	System.out.println("\tValue : " + notification.getValue());
         	})
			.subscribe(i -> System.out.println("Received: " + i +"\n"), e -> System.out.println("Received Error: " + e));
	}
}