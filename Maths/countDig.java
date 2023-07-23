package Maths;

public class countDig {

    static int iterative(int n){
        int count=1;
        while(n/10>0){
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n =1234567809;
        System.out.print(iterative(n));
    }
    
}
