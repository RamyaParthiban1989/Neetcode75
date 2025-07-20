package dsalgo.Heap;

public class MainClass {
    public static void main(String[] args) {
        int a[] = {9,3,4,2,5};
        Heap heap = new Heap(10);
        heap.insertAll(a);

        int i=0;
        int k=4;
        int val=0;
        while(i<k){
           val  = heap.extractMax();
           i++;
        }
        System.out.println(val);
    }
}
