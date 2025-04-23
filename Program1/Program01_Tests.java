import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Assignment02_Tests {

	@Test
	void test_countLonger_all() {
		// This has 3 tests in one method - the first one to fail ends the method
		
		// General case - both shorter and longer strings after the first
		String [] s1 = {"John", "Wilbur", "Ichabod", "Abe" };
		assertEquals(2, Assignment02.countLongerThanFirst(s1));
		
		// Just one string
		String [] s2 = {"John" };
		assertEquals(0, Assignment02.countLongerThanFirst(s2));
		
		// Empty string first - everything after is longer
		String [] s3 = {"", "Wilbur", "Ichabod", "Abe" };
		assertEquals(3, Assignment02.countLongerThanFirst(s3));
	}
	
	// Each of these methods contains one test, so all of them run every time.
	
	@Test
	void test_countLonger_general() {
		// General case - both shorter and longer strings after the first
		String [] s1 = {"John", "Wilbur", "Ichabod", "Abe" };
		assertEquals(2, Assignment02.countLongerThanFirst(s1));
	}	
	
	@Test
	void test_countLonger_one_string() {
		// Just one string
		String [] s1 = {"John" };
		assertEquals(0, Assignment02.countLongerThanFirst(s1));
	}
	
	@Test
	void test_countLonger_empty_first() {
		// Empty string first - everything after is longer
		String [] s1 = {"", "Wilbur", "Ichabod", "Abe" };
		assertEquals(3, Assignment02.countLongerThanFirst(s1));
	}
	
	@Test
    void test_countLonger_additional_case1() {
        // Additional case 1 - all strings longer than the first
        String[] s1 = {"apple", "banana", "cherry", "strawberry"};
        assertEquals(3, Assignment02.countLongerThanFirst(s1));
    }

    @Test
    void test_countLonger_additional_case2() {
        // Additional case 2 - all strings same length
        String[] s1 = {"apples", "banana", "orange", "grapes"};
        assertEquals(0,Assignment02.countLongerThanFirst(s1));
    }
    
    
    // 5 Test cases for countLongerThanN 
    
    @Test
    void test_countLongerThanN_general() {
        // General case - both shorter and longer strings after n
        String[] s1 = {"John", "Wilbur", "Ichabod", "Abe"};
        assertEquals(2, Assignment02.countLongerThanN(s1, 4));
    }

    @Test
    void test_countLongerThanN_no_longer_strings() {
        // No strings longer than n
        String[] s2 = {"John", "Wilbur", "Anne","Abe"};
        assertEquals(0, Assignment02.countLongerThanN(s2, 6));
    }

    @Test
    void test_countLongerThanN_empty_array() {
        // Empty array - no strings to compare
        String[] s3 = {};
        assertEquals(0, Assignment02.countLongerThanN(s3, 3));
    }

    @Test
    void test_countLongerThanN_single_string() {
        // Only one string in the array
        String[] s4 = {"John"};
        assertEquals(0, Assignment02.countLongerThanN(s4, 5));
    }

    @Test
    void test_countLongerThanN_all_longer_strings() {
        // All strings longer than n
        String[] s5 = {"John", "Wilbur", "Ichabod"};
        assertEquals(3,Assignment02.countLongerThanN(s5, 3));
    }

    // 5 Test cases for getLongerThanFirst
    
    @Test
    void test_getLongerThanFirst_general() {
        // General case - both shorter and longer strings after the first
        String[] s1 = {"John", "Wilbur", "Ichabod", "Abe"};
        ArrayList<String> result = Assignment02.getLongerThanFirst(s1);
        ArrayList<String> expected = new ArrayList<>(List.of("Wilbur", "Ichabod"));
        assertEquals(expected, result);
    }

    @Test
    void test_getLongerThanFirst_no_longer_strings() {
        // No strings longer than the first one
        String[] s2 = {"John", "Abe", "Eve"};
        ArrayList<String> result = Assignment02.getLongerThanFirst(s2);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void test_getLongerThanFirst_empty_array() {
        // Empty array - no strings to compare
        String[] s3 = {};
        ArrayList<String> result = Assignment02.getLongerThanFirst(s3);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void test_getLongerThanFirst_single_string() {
        // Only one string in the array
        String[] s4 = {"John"};
        ArrayList<String> result = Assignment02.getLongerThanFirst(s4);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void test_getLongerThanFirst_all_longer_strings() {
        // All strings longer than the first one
        String[] s5 = {"apple", "banana", "cherry", "strawberry"};
        ArrayList<String> result = Assignment02.getLongerThanFirst(s5);
        ArrayList<String> expected = new ArrayList<>(List.of("banana", "cherry", "strawberry"));
        assertEquals(expected, result);
    }
    
    // 5 Test cases for getLongerThanN
    
    @Test
    void test_getLongerThanN_general() {
        // General case - both shorter and longer strings after n
        String[] s1 = {"John", "Wilbur", "Ichabod", "Abe"};
        ArrayList<String> result = Assignment02.getLongerThanN(s1, 4);
        ArrayList<String> expected = new ArrayList<>(List.of("Wilbur", "Ichabod"));
        assertEquals(expected, result);
    }

    @Test
    void test_getLongerThanN_no_longer_strings() {
        // No strings longer than n
        String[] s2 = {"John", "Abe", "Eve"};
        ArrayList<String> result = Assignment02.getLongerThanN(s2, 5);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void test_getLongerThanN_empty_array() {
        // Empty array - no strings to compare
        String[] s3 = {};
        ArrayList<String> result = Assignment02.getLongerThanN(s3, 3);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void test_getLongerThanN_single_string() {
        // Only one string in the array
        String[] s4 = {"John"};
        ArrayList<String> result = Assignment02.getLongerThanN(s4, 5);
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void test_getLongerThanN_all_longer_strings() {
        // All strings longer than n
        String[] s5 = {"apple", "banana", "cherry", "date"};
        ArrayList<String> result = Assignment02.getLongerThanN(s5, 2);
        ArrayList<String> expected = new ArrayList<>(List.of("apple", "banana", "cherry", "date"));
        assertEquals(expected, result);
    }
    
    
}
    


