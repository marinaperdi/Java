package perdiguero;

//Marina Perdiguero, March 31, 2024
//CS252 - HOMEWORK 6
//Define a subclass PM67Manager of superclass PM67Staff representing a manager

import java.time.LocalDate;
import java.util.ArrayList;

public class PM67Manager extends PM67Staff{
	
	// Additional member to track employees managed by this manager
	private ArrayList<PM67Employee> teamMembers;

	// Default constructor. Initialize to the default values
	public PM67Manager() {
		super();
		teamMembers = new ArrayList<>();
    }
	
	// Parameterized constructor. Constructs an object with the given values
		public PM67Manager(String id, String firstName, String lastName, String position, LocalDate hiringDate, int annualSalary) {
			super(id,firstName,lastName,position,hiringDate,annualSalary);
			teamMembers = new ArrayList<>();
		}
	
	// Method to add a staff employee as a team member
    public boolean addTeamMember(PM67Staff member) {
        if (teamMembers.contains(member)) // Check if the member already exists in the team
            return false; // Fail to add if already exists
        teamMembers.add(member); // Add the member to the team
        member.setManager(this); // Update the manager of the member
        return true; // Success
    }
    
    // Method to remove a staff employee from the team
    public boolean removeTeamMember(PM67Staff member) {
        if (!teamMembers.contains(member)) // Check if the member exists in the team
            return false; // Can't remove someone who's not there
        teamMembers.remove(member); // Remove the member from the team
        member.setManager(null); // Update the manager of the member to null
        return true; // Success
    }
    
    // Override toString() method to provide a string representation of the manager
    @Override
    public String toString() {
        String teamNames = "";
        for (int i = 0; i < teamMembers.size(); i++) {
            teamNames += teamMembers.get(i).getFullName();
            if (i < teamMembers.size() - 1)
                teamNames += ", ";
        }
        return super.toString() + ", Manages: [" + teamNames + "]";
    }
	
	
	// returns the annual bonus of a manager, 8.2% of the annual salary
	public int getAnnualBonus() {
        return (int) (0.082 * getAnnualSalary());
    }

	// get the members of TeamMembers
	 public ArrayList<PM67Employee> getTeamMembers() {
	        return teamMembers;
	    
	}
}

