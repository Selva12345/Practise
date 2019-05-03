package com.rebirth;

import java.util.ArrayList;
import java.util.List;

class Identify {
	public static void main(String[] args) {
		List<Employee> em = new ArrayList<>();
		em.add(new Employee(07, "Paul Walker", "New jersey"));
		em.add(new Employee(02, "Beckham", "New York"));
		em.add(new Employee(05, "Brat Pitt", "LA"));
		em.add(new Employee(06, "Michael", "Los vegas"));
		List<Employee> em1 = new ArrayList<>();

		for (int i = 0; i < em.size(); i++) {
			for (int j = i + 1; j < em.size(); j++) {
				if (em.get(i).getId() > em.get(j).getId()) {
					Employee es = em.get(i);
					em.set(i, em.get(j));
					em.set(j, es);

				}
			}

		}
		for (Employee employee : em) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getLocation());
		}

	}
}
