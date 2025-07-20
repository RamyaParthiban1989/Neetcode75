package dsalgo.array;

public class DecreasingSubArray {
    public static void main(String[] args) {
        solution();
    }

    static long solution(){
        int a[] = {9,8,7,6,5};
        int possiblesubarray = 0,start=0,end=0;
        int n=a.length;
        for(start=0;start<n;start++){
            end = start;
            while(end+1<n && a[end]>a[end+1]){

            }
        }
        return possiblesubarray;
    }
}
