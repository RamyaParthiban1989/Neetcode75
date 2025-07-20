package dsalgo.array.continuguousSubArray;

public class main {
    public static void main(String[] args) {
        int a[] = {9,8,4,9,3};
        int b[] = {9,8,7,6,5};
        DecreasingOrderSubArray d = new DecreasingOrderSubArray();
        d.identifyAllDecreasingSubArrays(a);
        d.identifyAllDecreasingSubArrays(b);
    }
}
