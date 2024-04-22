package Strings;
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false
 
public class validAnagram {
    static boolean sol(String str1, String str2){
        int arr[] = new int[26];
        for(int i=0;i<str1.length();i++){
        arr[(str1.charAt(i) -'a')]++;
        }
        for(int i=0;i<str2.length();i++){
        arr[(str2.charAt(i) -'a')]--;
        }
        for(int i:arr){
            if(i!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(sol(str1, str2));
        
        String str3 = "cat";
        String str4 = "rat";
        System.out.println(sol(str3, str4));
        
    }
}
