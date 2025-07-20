package dsalgo.array.continuguousSubArray;

public class DecreasingOrderSubArray {

    public void identifyAllDecreasingSubArraysWithSreak(int a[]) {
        int count = 0;
        int streak = 1;
        int n = a.length;
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                streak++;
            }
            else{
               count+=streak * (streak +1)/2;
               streak=1;
            }
        }
        count+=streak*(streak +1)/2;
        System.out.println("Total subarray: "+count);
    }

    public void identifyAllDecreasingSubArrays(int a[]){

    }
}
