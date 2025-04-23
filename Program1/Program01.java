import java.util.ArrayList;
/* Program to write methods that work with arrays and ArrayLists, and implement JUnit tests 
 * Marina Perdiguero
 * February 18, 2024
 * */

public class Assignment02 {
	
	public static int countLongerThanFirst(String [] names) {
		/* Returns number of items in names that are longer than the first one in the array of Strings */
		if (names.length <= 1) {
	        return 0; // There's no other string to compare to the first one
	    }

	    int count = 0;
	    int firstLength = names[0].length();

	    for (int i = 1; i < names.length; i++) {
	        if (names[i].length() > firstLength) {
	            count++;
	        }
	    }

	    return count;
	}

	public static int countLongerThanN(String [] names, int n) {
		/* Returns number of items in names that are longer than n */
		if (names.length == 0) {
	        return 0; // Empty array, no strings to compare
	    }

	    int count = 0;

	    for (int i = 0; i < names.length; i++) {
	        if (names[i].length() > n) {
	            count++;
	        }
	    }

	    return count;
	}
	
	public static ArrayList<String> getLongerThanFirst(String [] names) {
		/* Returns an ArrayList of Strings that are longer than the first one in the array of Strings */
		ArrayList<String> newlist = new ArrayList<String>();
		if (names.length > 0) {
			String firstname = names[0];
			for (String name : names) {
				if (name.length() > firstname.length()) {
					newlist.add(name);
				}
			}
		}
		return newlist;
	}
	
	public static ArrayList<String> getLongerThanN(String [] names, int n) {
		/* Returns an ArrayList of Strings that are longer than n in the array of Strings */
		ArrayList<String> newlist = new ArrayList<String>();
		if (names.length > 0) {
			for (String name : names) {
				if (name.length() > n) {
					newlist.add(name);
				}
			}
		}
		return newlist;
	}	
	
	public static void main(String [] args) {
		System.out.println("Testing done by JUnit - Run as Junit instead");
	}
}


/*Reflection Questions
 * a. What did you learn from the assignment?
 * I learned how to use the JUnit for testing and to write methods with strings and ArrayLists
 * b. What did you find easy?
 * I think the easiest part was writing the test cases since once you understand the purpose it's really simple
 * c. What did you find difficult?
 * I think the hardest part was writing some of the methods correctly, but overall, it was not very hard
 * d. What suggestions, if any, do you have for improving this assignment
 * I really liked using the JUnit, I think it works great so I don't really have any suggestions for this assignment. I enjoyed it :)
*/
