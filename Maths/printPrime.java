package Maths;

public class printPrime {
    static void sol(int n) {
        // boolean isPrime = true;
        // if (n == 1) {
        //     System.out.println("1 is Composite number");
        //     // isPrime = false;
        // }
        
        // for(int i=2;i<=n;i++){
        //     int count=0;
        //     for(int j=2;j*j<=i;j++){
        //         if(i%j==0) count++;
                              
        //     }
        //     if(count ==0) System.out.println(i);

        // }

        for(int i=1;i<=n;i++){
            System.out.println(i+ prime.sol(i));
        }
    }
}
