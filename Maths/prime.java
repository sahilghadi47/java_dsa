package Maths;

public class prime {
    static String sol(int n) {
        if(n==1) return " Is composite number";
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) count++;
        }
        if(count==0) return " Is prime number";
        
        return " Is not prime number";
    }
}
    