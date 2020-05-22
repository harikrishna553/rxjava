package com.sample.app;

import java.util.Date;
import java.util.concurrent.Callable;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class ObservableCallableDemo {
	public static class CallableTask implements Callable<String> {
		String name;

		CallableTask(String name) {
			this.name = name;
		}

		public String call() {
			try {
				System.out.println(name + " Started Executing");
				Thread.sleep(1000);
				System.out.println(name + " Finishes Execution");
			} catch (Exception e) {

			}
			return (new Date() + " :: " + name);
		}
	}

	public static void main(String args[]) {

		Observable<String> observable = Observable.fromCallable(new CallableTask("TimerTask"));

		observable.subscribe(new Observer<String>() {

			@Override
			public void onSubscribe(@NonNull Disposable d) {
				System.out.println("I am subscribed");

			}

			@Override
			public void onNext(String t) {
				System.out.println("Received item : " + t);

			}

			@Override
			public void onError(Throwable e) {
				System.out.println("onError method is called\n");
				e.printStackTrace();
			}

			@Override
			public void onComplete() {
				System.out.println("Complete method is called");
			}

		});

	}

}
