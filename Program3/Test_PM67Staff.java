package perdiguero;

//Marina Perdiguero, March 31, 2024
//CS252 - HOMEWORK 6
//Junit tests for the revised class Staff

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;


public class Test_PM67Staff {

    // Test to check if setManager() method correctly assigns a manager to the staff
    @Test
    public void testSetManager() {
        PM67Staff staff = new PM67Staff();
        PM67Manager manager = new PM67Manager("201", "Manager", "Smith", "Manager", LocalDate.now(), 100000);
        staff.setManager(manager);
        assertEquals(manager, staff.getManager());
    }

    // Test to check if getAnnualBonus() method correctly calculates the annual bonus
    @Test
    public void testGetAnnualBonus() {
        PM67Staff staff = new PM67Staff("101", "John", "Doe", "Software Engineer", LocalDate.now(), 80000);
        int expectedBonus = (int) (80000 * 0.0125);
        assertEquals(expectedBonus, staff.getAnnualBonus());
    }

    // Test to check if toString() method correctly represents the staff object with manager information
    @Test
    public void testToStringWithManager() {
        PM67Manager manager = new PM67Manager("201", "Manager", "Smith", "Manager", LocalDate.now(), 100000);
        PM67Staff staff = new PM67Staff("101", "John", "Doe", "Software Engineer", LocalDate.now(), 80000);
        staff.setManager(manager);
        String expected = "ID: 101, Name: John Doe, Position: Software Engineer, HiringDate: " + LocalDate.now() + ", Salary: $80,000 (Bonus: $1,000), Manager: Manager Smith";
        assertEquals(expected, staff.toString());
    }
    
    // Test to check if toString() method correctly represents the staff object without manager information
    @Test
    public void testToStringWithoutManager() {
        PM67Staff staff = new PM67Staff("101", "John", "Doe", "Software Engineer", LocalDate.now(), 80000);
        String expected = "ID: 101, Name: John Doe, Position: Software Engineer, HiringDate: " + LocalDate.now() + ", Salary: $80,000 (Bonus: $1,000), Manager: none";
        assertEquals(expected, staff.toString());
    }

    // Test to check if setManager() method correctly updates the manager field of the staff
    @Test
    public void testSetManagerUpdate() {
        PM67Staff staff = new PM67Staff("101", "John", "Doe", "Software Engineer", LocalDate.now(), 80000);
        PM67Manager manager = new PM67Manager("201", "Manager", "Smith", "Manager", LocalDate.now(), 100000);
        staff.setManager(manager);
        assertEquals(manager, staff.getManager());

        // Now, update the manager
        PM67Manager newManager = new PM67Manager("202", "New", "Manager", "Manager", LocalDate.now(), 120000);
        staff.setManager(newManager);
        assertEquals(newManager, staff.getManager());
    }
	
}
