package perdiguero;

//Marina Perdiguero, March 31, 2024
//CS252 - HOMEWORK 6
//Define a class PM67HRPufnstuf with a main method that prints the information and the feedback questions in a comment at the end

import java.time.LocalDate;

public class PM67HRPufnstuf {

	public static void main(String[] args) {
		
		// create Staff object s1 and s2
		PM67Staff s1 = new PM67Staff("20", "S1Marina", "Perdiguero", "Super Manager", LocalDate.now().minusYears(5), 1000000);	
		PM67Staff s2 = new PM67Staff("60", "S2Sheridan", "Curley", "Intern I", LocalDate.now().minusYears(1), 60000);
		
		// create Manager object m1 and m2
		PM67Manager m1 = new PM67Manager("201", "M1Mike", "Jordan", "Tech Lead III", LocalDate.now().minusYears(4), 150000);
        PM67Manager m2 = new PM67Manager("202", "M2Alice", "Jones", "Project Manager", LocalDate.now().minusYears(3), 130000);
        
        // Add team members
        m1.addTeamMember(s1);
        m1.addTeamMember(m2);
        m2.addTeamMember(s2);

        // Print staff and manager information
        System.out.println("Staff1:");
        System.out.println(s1);
        System.out.println("Staff2:");
        System.out.println(s2);
        System.out.println("Manager1:");
        System.out.println(m1);
        System.out.println("Manager2:");
        System.out.println(m2);

        // Remove manager #2 from manager #1's team
        m1.removeTeamMember(m2);

        // Print manager information again
        System.out.println("After removing Manager2 from Manager1's team:");
        System.out.println("Manager1:");
        System.out.println(m1);
        System.out.println("Manager2:");
        System.out.println(m2);
    }
	
}


/* (a) What’s the hardest part of this assignment for you? Please explain.
 * I think the hardest part was the overriding method toString() for manager and staff class. However, the pdf helped me a lot 
 * and I was able to complete it just fine. Also, the extra credit was kind of hard since I didn't know what tests I should have
 * done, and then I realized I needed a getter and I had to create it.
 * (b) Were you able to understand the relationships between classes in this assignment? How has your 
 * understanding of inheritance and composition changed by the end of this assignment?
 * Yes, at the beginning I didn't really understand it but then I realized what was going on and I completely understood the relationships.
 * I can say that my understanding of inheritance and composition has improved a lot after this assignment, it helped me understand the
 * concepts better and it was very good practice for the Exam2.
*/


