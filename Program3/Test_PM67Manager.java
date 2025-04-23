package perdiguero;

//Marina Perdiguero, March 31, 2024
//CS252 - HOMEWORK 6
//Junit tests for the revised class Manager

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class Test_PM67Manager {

	// Test to check if addTeamMember() method adds a member to the team
    @Test
    public void testAddTeamMember() {
        PM67Manager manager = new PM67Manager("101", "John", "Doe", "Manager", LocalDate.now(), 100000);
        PM67Staff staff = new PM67Staff("201", "Jane", "Smith", "Employee", LocalDate.now(), 60000);
        assertTrue(manager.addTeamMember(staff));
        assertEquals(1, manager.getTeamMembers().size());
        assertTrue(manager.getTeamMembers().contains(staff));
    }

    // Test to check if removeTeamMember() method removes a member from the team
    @Test
    public void testRemoveTeamMember() {
        PM67Manager manager = new PM67Manager("101", "John", "Doe", "Manager", LocalDate.now(), 100000);
        PM67Staff staff = new PM67Staff("201", "Jane", "Smith", "Employee", LocalDate.now(), 60000);
        manager.addTeamMember(staff);
        assertTrue(manager.removeTeamMember(staff));
        assertEquals(0, manager.getTeamMembers().size());
        assertFalse(manager.getTeamMembers().contains(staff));
    }

    // Test to check if addTeamMember() method fails when trying to add an existing team member
    @Test
    public void testAddExistingTeamMember() {
        PM67Manager manager = new PM67Manager();
        PM67Staff staff = new PM67Staff("201", "Jane", "Smith", "Employee", LocalDate.now(), 80000);
        manager.addTeamMember(staff);
        assertFalse(manager.addTeamMember(staff));
    }

    // Test to check if removeTeamMember() method fails when trying to remove a non-existing team member
    @Test
    public void testRemoveNonExistingTeamMember() {
        PM67Manager manager = new PM67Manager();
        PM67Staff staff = new PM67Staff("201", "Jane", "Smith", "Employee", LocalDate.now(), 80000);
        assertFalse(manager.removeTeamMember(staff));
    }
    
    // Test to check if getAnnualBonus() method correctly calculates the annual bonus
    @Test
    public void testGetAnnualBonus() {
        PM67Staff manager = new PM67Manager("101", "John", "Doe", "Software Engineer", LocalDate.now(), 80000);
        int expectedBonus = (int) (80000 * 0.082);
        assertEquals(expectedBonus, manager.getAnnualBonus());
    }
}
