package com.elemica.supply.chain.assign01;

public class Staff {
	 int id;
	    String name;
	    double salary;
	    String department;

	    Staff(int id, String name, double salary, String department) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.department = department;
	    }

	    public double getSalary() { return salary; }
	    public String getDepartment() { return department; }
	    public String getName() { return name; }

	    @Override
	    public String toString() {
	        return name + " - " + salary + " - " + department;
	    }

}
