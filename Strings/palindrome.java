package Strings;

// You are given a string 'S'. Your task is to check whether the string is palindrome or not. For checking palindrome, consider alphabets and numbers only and ignore the symbols and whitespaces.
// Note :

// String 'S' is NOT case sensitive.
// Example :

// Let S = “c1 O$d@eeD o1c”.
// If we ignore the special characters, whitespaces and convert all uppercase letters to lowercase, we get S = “c1odeedo1c”, which is a palindrome. Hence, the given string is also a palindrome.
public class palindrome {
    static boolean alphaNumeric(char ch){
        if((!(ch >= 'a' && ch <= 'z' ) && !(ch >='0' && ch <= '9')) && !(ch >='A' && ch <='Z')) return true;
        return false;
    }
    static boolean brute( String str){
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");  

		int left =0;
		int right = str.length()-1;
		while(left<= right){
			if(str.charAt(left) != str.charAt(right)) return false;
			left++;
			right--;
		} 
		return true;
    }
    public static void main(String[] args) {
        String str = "c1 O$d@eeD o1c";
        System.out.println(brute(str));
    }

}
