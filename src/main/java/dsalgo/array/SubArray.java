package dsalgo.array;

public class SubArray {

    /* 9,8,7,6,5
     9,8,7,6
     9,8,7
     9,8
     8,7,6,5
     8,7,6
     8,7
     7,6,5
     7,6
     6,5
     */

   static long solution1() {
       int a[] = {9,8,7,6,5};
        int start=0,end=0;
        int possiblesubarrays = 0;

        int n= a.length;
        // 9,8,7,6,5

        /*while(start<n ) {
            end = start;

            while (end + 1 < n && a[end] > a[end + 1]) {
                end++;
            }

            for (int i = start; i <= end; i++) {
                System.out.println();
                for (int j = i; j <= end; j++) {
                    //System.out.print(a[j]);
                    printSubArray(i, j, a);
                    possiblesubarrays++;
                }
            }
            start = end+1;
        }*/
       for(start=0;start<n;start++){
           end=start;
           while(end+1<n && a[end]>a[end+1]){
               end++;
           }

           for(int i=start;i<=end;i++){
               for(int j=i; j<=end; j++){
                   printSubArray(i,j,a);
                   possiblesubarrays++;
               }
           }
           start=end;
       }
       System.out.println("Total count : "+possiblesubarrays);
        return possiblesubarrays;
    }

    static long solution(int arr[]){
        long count = 0;  // Total number of valid subarrays
        int n = arr.length;

        int length = 1;  // Start with a single element (valid by itself)

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                // Still decreasing
                length++;
            } else {
                // Sequence broke, count subarrays from the previous decreasing sequence
                count += (long) length * (length + 1) / 2;
                length = 1;  // Reset for new sequence
            }
        }

        // Add the last decreasing segment
        count += (long) length * (length + 1) / 2;
        System.out.println("Total count : "+count);
        return count;
    }

    static void printSubArray(int start, int end,int a[]){
       for(int i=start;i<=end;i++){
           System.out.print(a[i]+",");
       }
        System.out.println(" ");
    }

    public static void main(String[] args) {
       int arr[] = {9,8,7,6,5};
        solution1();
    }
}


/*
9,8,4,9,3

9,8,4  9,3
8,4    3
4
9
8
9

 */