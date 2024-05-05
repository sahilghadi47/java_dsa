package Maths;

public class palindromeNum {

    static boolean sol(int n){
        char[] num = String.valueOf(n).toCharArray();
        int i =0;
        int j = num.length-1;
        while(i<=j){
            if(num[i] != num[j]) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int n =1221;
        System.out.println(sol(n));
    }    
}
