package Strings;

public class scoreString {
    static int scoreOfString(String s) {
            int sum =0;
            int diff =0;
            for(int i=0;i<s.length()-1;i++){
                diff= Math.abs(Integer.valueOf(s.charAt(i)) - Integer.valueOf(s.charAt(i+1)) );
                sum +=diff;
            }
            return sum;
        }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }
}
