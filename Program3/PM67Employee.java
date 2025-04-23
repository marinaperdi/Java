package perdiguero;

// Marina Perdiguero, March 31, 2024
// CS252 - HOMEWORK 6
// Define a class PM67Employee representing an employee

import java.time.LocalDate;

public abstract class PM67Employee {
	private String id;
	private String firstName;
	private String lastName;
	private String position;
	private LocalDate hiringDate;
	private int annualSalary;

	// Default constructor. Set member variables to null or 0
	public PM67Employee() {} 

	// Constructor with parameters to set the private variables
	public PM67Employee(String id, String firstName, String lastName, String position,
			LocalDate hiringDate, int annualSalary) {
		this.id           = id;
		this.firstName    = firstName;
		this.lastName     = lastName;
		this.position     = position;
		this.hiringDate   = hiringDate;
		this.annualSalary = annualSalary;
	} 

	// Gets the id of this object
	public String getId() {
		return id;
	}

	// Sets the id of this object with the given value
	public void setId(String id) {
		this.id = id;
	}

	// Gets the first name of this object
	public String getFirstName() {
		return firstName;
	}

	// Sets the first name of this object with the given value
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Gets the last name of this object
	public String getLastName() {
		return lastName;
	}

	// Sets the last name of this object with the given value
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Gets the position of this object
	public String getPosition() {
		return position;
	}

	// Sets the position of this object with the given value
	public void setPosition(String position) {
		this.position = position;
	}

	// Gets the hiring date of this object
	public LocalDate getHiringDate() {
		return hiringDate;
	}

	// Sets the hiring date of this object with the given value
	public void setHiringDate(LocalDate hiringDate) {
		this.hiringDate = hiringDate;
	}

	// Gets the annual salary of this object
	public int getAnnualSalary() {
		return annualSalary;
	}

	// Sets the annual salary of this object with the given value
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	// Returns the full name of this object
	public String getFullName() {
		return firstName + " " + lastName;
	}

	// Returns a string representation of this employee
	@Override
	public String toString() {
		return String.format("ID: %s, Name: %s, Position: %s, HiringDate: %s, Salary: $%,d (Bonus: $%,d)", 
				id, getFullName(), position, hiringDate, annualSalary, getAnnualBonus());
	} 

	// Returns the annual bonus of this employee. 
	// Needs to be implemented by each subclass.
	public abstract int getAnnualBonus();

} // end class Employee

