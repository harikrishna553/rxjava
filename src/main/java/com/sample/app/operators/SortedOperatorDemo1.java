package com.sample.app.operators;

import java.util.Arrays;

import io.reactivex.rxjava3.core.Observable;

public class SortedOperatorDemo1 {

	public static class Employee {
		private int id;
		private String firstName;
		private String lastName;

		public Employee(int id, String firstName, String lastName) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}

	}

	public static void main(String args[]) {
		Employee emp1 = new Employee(1, "Krishna", "Gurram");
		Employee emp2 = new Employee(2, "Gopi", "Battu");
		Employee emp3 = new Employee(3, "Abdul", "Rahim");
		Employee emp4 = new Employee(4, "Joel", "Chelli");
		Employee emp5 = new Employee(5, "Jayababu", "Padhamuttam");

		Observable.fromIterable(Arrays.asList(emp1, emp2, emp3, emp4, emp5))
				.sorted((employee1, employee2) -> employee1.firstName.compareTo(employee2.firstName))
				.subscribe(System.out::println);

	}

}