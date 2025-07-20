package dsalgo.array;

public class maxsubarraysum {


    public static void main(String[] args) {
       int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int start=0,end=0;
        int max=Integer.MIN_VALUE;
       for(int i=0;i< nums.length;i++){
           if(sum<=0){
               sum=0;
               start=i;
           }
           sum = Math.max(sum+nums[i],nums[i]);
           if(sum>max){
                max=sum;
                end=i;
           }
       }
       System.out.println("Maximum Subarray Sum: " + max);

       for(int i=start;i<=end;i++){
           System.out.print(nums[i] + " ");
       }
    }
}
