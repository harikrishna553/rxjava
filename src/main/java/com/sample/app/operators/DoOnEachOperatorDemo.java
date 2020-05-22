package com.sample.app.operators;

import io.reactivex.rxjava3.core.Observable;

public class DoOnEachOperatorDemo {
	public static void main(String args[]) {
		 Observable
		 .just("Hello", "How", "Are", "You")
         .doOnEach(notification -> {
        	 	System.out.println("doOnEach: " + notification);
        	 	System.out.println(notification.isOnNext() + "," + notification.isOnError() + "," + notification.isOnComplete());
         		})
         .subscribe(i -> System.out.println("Received: " + i));
	}

}


