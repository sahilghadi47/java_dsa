package Maths;

public class powerOfTwo {
    static boolean sol(int n, int target){
        for(int i=0;i<31;i++){
            int ans= (int)Math.pow(2,i);
            if(ans==target) return true;
        }
        return false;
    }
}
