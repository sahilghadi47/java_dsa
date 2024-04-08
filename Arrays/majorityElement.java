// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

package Arrays;

import java.util.HashMap;
import java.util.Map;


public class majorityElement {
    int brute(int arr[] , int size){
        
        int count=0;
        for(int i=0;i<size; i++){
            for(int j=0;j<size;j++){
                if(arr[j]==arr[i]) count++;
                
                
            }
            if(count >size/2 )  return arr[i];
        }
        return -1;
    }
    int hashing(int arr[] , int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int value=map.getOrDefault(arr[i] ,0 );
            map.put(arr[i],value+1);
        }
        for(Map.Entry<Integer , Integer> it : map.entrySet()){
            if(it.getValue()>n/2) return it.getKey();
        }

        return -1;
    }
    int moreesVotingAlgo(int arr[] , int n){
        int count=0;
        int ele=-1;
        for(int i =0;i<n;i++){
            if(count ==0){
                count =1;
                ele=arr[i];

            }else if(arr[i]==ele) count++;
            else count--;

        }
        return ele;
    }

    public static void main(String[] args) {
        majorityElement ans = new majorityElement();
        int arr[] ={1,2,2,3,3,3,3};
        int k=ans.moreesVotingAlgo(arr,arr.length);
        System.out.println(k);
    }
}
