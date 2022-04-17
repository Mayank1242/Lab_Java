/* Problem Statement: P7_SwitchStatements:
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */
package unit_01;
import java.util.*;
public class P7_Switch_Statement {
	 public static void main(String[] args) {

	        SwitchStatements obj = new SwitchStatements();
	        obj.switchStatements();

	    }

	}

	class SwitchStatements {
	    void switchStatements() {

	        // Write Logic here!
	        Scanner s = new Scanner(System.in);

	        int ch = s.nextInt();

	        switch (ch)
	        {
	            case 1:
	                System.out.println("Current year " + "2022");
	                break;

	            case 2:
	                System.out.println("Current month is " +  "April");
	                break;

	            case 3:
	                System.out.println("Current day is " + "ThursDay");
	                break;

	            case 4:
	            default:
	                System.out.println("Not applicable ");
	                break;
	        }

	    }
}
