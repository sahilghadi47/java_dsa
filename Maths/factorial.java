package Maths;

public class factorial {
    static int recursive(int n){
        if(n>1){
            return n*recursive(n-1);
        }
        return n;
    }

    static int iterative(int n){
        int ans =1;
        for(int i=n;i>0;i--) ans*=i;
        return ans;
    }

    public static void main(String[] args) {
        int n =6;
        System.out.println(factorial.recursive(n));
        System.out.println(factorial.iterative(n));
    }
    
}
