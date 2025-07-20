package dsalgo.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueImplementation {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums) {
            maxHeap.offer(num);
        }

        int result=-1;
        int i=0;
        while(i<k){
            result = maxHeap.poll();
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 1;
        int result = findKthLargest(nums, k);
        System.out.println("Kth largest element: " + result);
    }
}
