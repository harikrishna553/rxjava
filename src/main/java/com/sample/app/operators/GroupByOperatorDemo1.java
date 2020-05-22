package com.sample.app.operators;

import java.util.Arrays;
import java.util.List;

import com.sample.app.model.Employee;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.GroupedObservable;

public class GroupByOperatorDemo1 {
	public static void main(String args[]) {
		Employee emp1 = new Employee(1, "Hari Krishna", "Gurram", 26, "Bangalore", 40000);
		Employee emp2 = new Employee(2, "Joel", "Chelli", 27, "Hyderabad", 50000);
		Employee emp3 = new Employee(3, "Shanmukh", "Kummary", 28, "Chennai", 35000);
		Employee emp4 = new Employee(4, "Harika", "Raghuram", 27, "Chennai", 76000);
		Employee emp5 = new Employee(5, "Sudheer", "Ganji", 27, "Bangalore", 90000);
		Employee emp6 = new Employee(6, "Rama Krishna", "Gurram", 27, "Bangalore", 56700);
		Employee emp7 = new Employee(7, "PTR", "PTR", 27, "Hyderabad", 123456);
		Employee emp8 = new Employee(8, "Siva krishna", "Ponnam", 28, "Hyderabad", 98765);
		Employee emp9 = new Employee(9, "Raju", "Antony", 40, "Trivendram", 198765);
		Employee emp10 = new Employee(10, "Brijesh", "Krishnan", 34, "Trivendram", 100000);
		Employee emp11 = new Employee(11, "Raju", "Antony", 40, "Trivendram", 198765);
		Employee emp12 = new Employee(12, "Brijesh", "Krishnan", 34, "Trivendram", 100000);

		List<Employee> emps = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11, emp12);

		
		Observable<String> countries = Observable.just("India", "Canada", "China", "Nepal", "Australia", "America",
				"Zimbabwe", "Angola");

		Observable<GroupedObservable<Integer, String>> countryNamesByLength = countries.groupBy(s -> s.length());

		countryNamesByLength.flatMapSingle(group -> group.toList()).subscribe(System.out::println);

	}
}
