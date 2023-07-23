package Maths;

public class fibonacci {
    static int sol(int n, int a,int b){
        if(n>1){
            System.out.print(a+"\t");//print 1st n-1 fib no
            return sol(n-1, b, a+b);
        }
        System.out.print(a);// print nth fib no;
        return a;
        
    }

    static void sol1(int n){
        int a=1;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+"\t");
            int c =a+b;
            a=b;
            b=c;
        }

    }
    public static void main(String[] args) {
        int n = 10;
        sol1(n);
        System.out.println("\n---------------------------------------------------------------------------------");
        sol(n,1,1);

    }
}
