package com.house.study.java_.first.steps.poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeManager {

	public static void main(String[] args) {

		// Employee employee1 = new Employee("Francisco Periago", 120000, 2017, 9, 18);
		// Employee employee2 = new Employee("Adri�n S�nchez", 250000, 1995, 6, 2);
		// Employee employee3 = new Employee("Antonio P�rez", 85000, 2002, 2, 15);
		//
		// employee1.increaseSalary(5);
		// employee2.increaseSalary(15);
		// employee3.increaseSalary(1);
		//
		// System.out.printf("Name: %s, Salary: %s, Hire day: %s \n",
		// employee1.getName(), employee1.getSalary(), employee1.getHireDay());
		// System.out.printf("Name: %s, Salary: %s, Hire day: %s \n",
		// employee2.getName(), employee2.getSalary(), employee2.getHireDay());
		// System.out.printf("Name: %s, Salary: %s, Hire day: %s \n",
		// employee3.getName(), employee3.getSalary(), employee3.getHireDay());

		Leadership bossHHRR = new Leadership("Fran", 75000, 2017, 10, 18);

		bossHHRR.setIncentive(3000);

		Employee[] myEmployees = new Employee[6];
		myEmployees[0] = new Employee("Paco G�mez", 85000, 1990, 12, 17);
		myEmployees[1] = new Employee("Francisco Periago", 10500, 2017, 9, 18);
		myEmployees[2] = new Employee("Mar�a P�rez", 45000, 2014, 06, 2);
		myEmployees[3] = new Employee("Antonio Fern�ndez");
		myEmployees[4] = bossHHRR; // Polymorphisme. Principio de sustituci�n.
		myEmployees[5] = new Leadership("Luis Gonz�lez", 70000, 2003, 5, 3); // Polymorphisme.

		Leadership bossFinances = (Leadership) myEmployees[5];

		bossFinances.setIncentive(55000);
		
		System.out.println(bossFinances.takeDecission("Getting more days of vacations to the employees"));

		// for (int i = 0; i < myEmployees.length; i++) {
		// myEmployees[i].increaseSalary(5);
		// System.out.printf("Name: %s, Salary: %s, Hire day: %s \n",
		// myEmployees[i].getName(), myEmployees[i].getSalary(),
		// myEmployees[i].getHireDay());
		// }

//		Employee commercialBoss = new Leadership("Sandra", 85000, 2012, 5, 5);
//		Comparable example = new Employee("Elisabeth", 95000, 2011, 6, 7);
//		
//		if (commercialBoss instanceof Employee) {
//			System.out.println("It's Leadership type.");
//		}
//		
//		if (example instanceof Comparable) {
//			System.out.println("It implements Comparable interface.");
//		}

		for (Employee employee : myEmployees) {
			employee.increaseSalary(5);
		}
		
		Arrays.sort(myEmployees);
		
		for (Employee employee2: myEmployees) {
			System.out.println("Name: " + employee2.getName() + " Salary: " + employee2.getSalary() + " Hire day: " + employee2.getHireDay() + ".");
		}
	
	}

}

class Employee implements Comparable {

	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hire = calendar.getTime();
	}

	public Employee(String name) {
		this(name, 3000, 2000, 01, 01);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hire;
	}

	public void increaseSalary(double percentage) {
		double increase = salary * percentage / 100;
		salary += increase;
	}

	public int compareTo(Object myObject) {
		
		Employee otherEmployee = (Employee) myObject;
		
		if (this.salary < otherEmployee.salary) {
			return -1;
		}
		
		if (this.salary > otherEmployee.salary) {
			return 1;
		}
		else {
			return 0;
		}
	}

	private String name;
	private double salary;
	private Date hire;
		
}

class Leadership extends Employee implements Boss {

	private double incentive;

	public Leadership(String name, double salary, int year, int month, int day) {

		super(name, salary, year, month, day);

	}
	
	public String takeDecission(String decission) {
		return "A member of the Leadership have took the decission of: " + decission;
	}

	public void setIncentive(double incentive) {

		this.incentive = incentive;
	}

	public double getSalary() {

		double bossSalary = super.getSalary();
		return bossSalary + incentive;
	}

}
