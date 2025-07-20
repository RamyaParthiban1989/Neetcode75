package dsalgo.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianinAStream {
    public static ArrayList<Double> getMedian(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        Double median = 0.0;
        ArrayList<Double> medians = new ArrayList<Double>();
        int size=0;
        for(int i: arr){
            heap.offer(i);
            size++;
            median = findMedian(heap);
            medians.add(median);
        }
        return medians;
    }

    private static Double findMedian(PriorityQueue<Integer> heap) {
        Double median =0.0d;
        int size = heap.size();
        int mid=0;
        if(size%2!=0){
           mid=(size+1)/2;
           median = findValueOfMid(mid,heap);
        }else{
            mid = size/2;
            median = (findValueOfMid(mid,heap)+findValueOfMid(mid+1,heap))/2;
        }
        return median;
    }

    private static Double findValueOfMid(int mid, PriorityQueue<Integer> heap) {
        PriorityQueue<Integer> heapcopy = new PriorityQueue<>(heap);
        int i=0;
        Double median =0.0;
        while(i<mid){
            median = Double.valueOf(heapcopy.poll());
            i++;
        }
        return median;
    }

    public static void main(String[] args) {
        int[] arr = {5, 15, 1, 3, 2, 8};
        //5
        // 5 15
        // 1 5 15
        // 1 3 5 15
        // 1 2 3 5 15
        // 1 2 3 5 8 15
        ArrayList<Double> medians = getMedian(arr);
        medians.forEach(item -> {
            System.out.println(item);
        });

        // 5
        // 15
    }
}
