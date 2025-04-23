package perdiguero;

//Marina Perdiguero, March 31, 2024
//CS252 - HOMEWORK 6
//Define a subclass PM67Staff of superclass PM67Employee representing a staff

import java.time.LocalDate;

public class PM67Staff extends PM67Employee{
	
	// Additional data member identifies manager of this staff
	private PM67Manager manager;
	
	// Default constructor. Initialize to the default values except the default first and last name should be your own
	public PM67Staff() {
		super();
		setFirstName("Marina");
		setLastName("Perdiguero");
		this.manager = null;
	}
	
	// Parameterized constructor. Constructs an object with the given values
	public PM67Staff(String id, String firstName, String lastName, String position, LocalDate hiringDate, int annualSalary) {
		super(id,firstName,lastName,position,hiringDate,annualSalary);
		this.manager = null;
	}
	
	// Getter method for manager
    public PM67Manager getManager() {
        return manager;
    }
    
    // Setter method for manager 
    protected void setManager(PM67Manager manager) {
        this.manager = manager;
    }
    
    // toString() method to provide a string representation of the object
    @Override
    public String toString() {
        String managerInfo;
        if (getManager() != null) {
            managerInfo = "Manager: " + getManager().getFullName();
        } else {
            managerInfo = "Manager: none";
        }
        return super.toString() + ", " + managerInfo;
    }
    
    // returns the annual bonus of a staff, 1.25% of the annual salary.
 	@Override
 	public int getAnnualBonus() {		
 		return (int) (getAnnualSalary() * 0.0125);
 	}
}
