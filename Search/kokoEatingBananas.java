package Search;

// Problem Statement: A monkey is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas. An integer ‘h’ is also given, which denotes the time (in hours) for all the bananas to be eaten.
// Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas. If the pile contains less than ‘k’ bananas, then the monkey consumes all the bananas and won’t eat any more bananas in that hour.
// Find the minimum number of bananas ‘k’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours.
// Sample Input 1:
// 4
// 7 15 6 3
// 8

// Sample Output 1:
// 5
public class kokoEatingBananas {
    static int max(int [] piles){
        int max = piles[0];
        for(int i:piles){
            max = Math.max(max ,i);
        }
        return max;
    }
    static int calTotalHours(int []piles,int n){
        int totalHours =0;
        for(int i=0;i<piles.length;i++){
            totalHours +=Math.ceil((double)piles[i]/n);
        }
        return totalHours;
    }

    static int linearSearch(int piles[], int h){
        int max =max(piles);
        for(int i=1;i<max;i++){
            int minHours = calTotalHours(piles, i);
            if(minHours <= h) return i;
        }
        return max;
    }

    static int binarySearch(int piles[], int h){
        int low =0;
        int high = max(piles);
        while(low <= high){
            int mid = (low+high)/2;
            if(calTotalHours(piles, mid)<= h ) high = mid-1;
            else low = mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int piles [] ={7,15,6,3};
        System.out.println(linearSearch(piles, 8));
        System.out.println(binarySearch(piles, 8));
    }
}