package dsalgo.Heap;

public class Heap {
    int heap[];
    int size;
    int capacity = 10;
    Heap(){}

    public Heap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }


    int parent(int i){ return (i-1)/2;}
    int left(int i) {return (2*i+1);}
    int right(int i){return (2*i+2);}



    void insert(int i){
        int current=0;
        if(size==10){
            throw new RuntimeException("Capacity is full");
        }
        else{
            heap[size] = i;
            current =size;
            size++;
        }

        while(current>0 && heap[current] > heap[parent(current)]){
            swap(current,parent(current));
            current = parent(current);
        }
    }

    private void swap(int current, int parent) {
        int temp =heap[current];
        heap[current] = heap[parent];
        heap[parent] = temp;
    }


    int extractMax(){
       int max=heap[0];
       heap[0] = heap[size-1];
       heapify(0);
       size--;
       return max;
    }

    private void heapify(int root) {
        int largest = root;
        int left = left(root);
        int right = right(root);

        if(left <size && heap[left] > heap[largest]){
            largest = left;
        }
        if(right<size && heap[right] > heap[largest]){
            largest = right;
        }

        if(largest!=root){
           swap(largest,root);
           heapify(largest);
        }

    }

    void insertAll(int a[]){
        for(int i:a){
            insert(i);
        }
    }


}
