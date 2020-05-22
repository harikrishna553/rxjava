package com.sample.app;

import io.reactivex.rxjava3.core.Completable;

public class CompletableObservableDemo {
	public static void main(String args[]) {

		Runnable runnableTask = new Runnable() {
			public void run() {
				System.out.println("Finished task");
			}
		};

		Completable.fromRunnable(runnableTask).subscribe(() -> System.out.println("Done!"));
	}

}
