package stacks;

import java.util.Arrays;
import java.util.LinkedList;

public class StackChallenge {

    public static void main(String[] args) {
//        // should return true
        System.out.println(checkForPalindrome("abccba"));
//        // should return true
        System.out.println(checkForPalindrome("Was it a car or a ,cat I saw?"));
//        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
//        // should return false
        System.out.println(checkForPalindrome("hello"));
//        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }
    
    public static boolean checkForPalindrome(String string) {
    	 
    	string =string.replaceAll("(\\s)|[?.,']","");
    	string=string.toLowerCase();


    	char[] tabChar= string.toCharArray();
    	LinkedList<Character> stack = new LinkedList<Character>();
    	
    	for (char c:tabChar) {
    		stack.push(c);
    	}
//    	stack.printStack();
    	
    	char[] tab2 = new char[tabChar.length];
    	for (int i = 0; i<tabChar.length; i++) {
    		tab2[i] = stack.pop();
    	}
    	
    	return Arrays.equals(tabChar, tab2);
	}

    public static boolean checkForPalindrome2(String string) {
 
    	string =string.replaceAll("(\\s)|[?.,']","");
    	string=string.toLowerCase();
//    	System.out.println(string);

    	char[] tabChar= string.toCharArray();
    	CharStack stack = new CharStack(tabChar.length);
    	
    	for (char c:tabChar) {
    		stack.push(c);
    	}
//    	stack.printStack();
    	
    	char[] tab2 = new char[tabChar.length];
    	for (int i = 0; i<tabChar.length; i++) {
    		tab2[i] = stack.pop();
    	}
    	
    	return Arrays.equals(tabChar, tab2);
	}
    
  

}


