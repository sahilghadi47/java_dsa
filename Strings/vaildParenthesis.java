package Strings;
// A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

// For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
// A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

// Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

// Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
public class vaildParenthesis {
    static String vaild(String str){
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count++;
                if(count>1){
                    sb.append(str.charAt(i));
                }
            }else if(str.charAt(i)==')'){
                count--;
                if(count !=0){
                    sb.append(str.charAt(i));
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str ="(()())((()))";
        System.out.println(vaild(str));
    }
}
