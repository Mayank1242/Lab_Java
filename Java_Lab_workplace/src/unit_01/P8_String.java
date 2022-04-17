/* Problem Statement:
P8_String: 
(Create separate logic in separate function)
F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.
F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?
 * */
package unit_01;

public class P8_String {
	 public static void main(String[] args) {

	        QuestionsOnString obj = new QuestionsOnString();

	        String s1 = new String("rar");
	        String s2 = new String("rar");

	        obj.palindromeOrNot(s1);
	        obj.reverseOfAString(s1);
	        obj.stringEqualOrNot(s1, s2);

	    }

	}

	class QuestionsOnString {

	    void palindromeOrNot(String s) {
	        // Write Logic Here!

	        String str = "";
	        for(int k=s.length()-1;k>=0;--k)
	        {
	            char ch = s.charAt(k);
	            str = str + ch;
	        }

	        if(s.compareTo(str) == 0)
	        {
	            System.out.println("YES _ Palindrome ");
	        }

	        else
	        {
	            System.out.println("NOT _ Palindrome ");
	        }
	    }

	    void reverseOfAString(String s) {
	        // Write Logic Here!
	        char ch[] = s.toCharArray();
	        String reverse = "";

	        for(int i=ch.length-1;i>=0;--i) {
	            reverse = reverse + ch[i];
	        }

	        System.out.println("Reverse  :" + reverse);

	    }

	    void stringEqualOrNot(String s1,String s2) {
	        // Write Logic Here!
	        System.out.println("Equal :" + s1.equals(s2));

	    }
}
