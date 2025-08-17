package dsalgo.list.ReverseLinkedList;

public class ReverseLinkedList {

        public static void main(String[] args) {
            int a[] = {0,1,2,3,4};
            LinkedListImpl list = new LinkedListImpl();
            for(int i : a){
                list.insert(i);
            }
            list.displayAllNodes();
            list.reverse();
            list.displayAllNodes();
            list.removeNthNodeFromEndList(3);
            list.displayAllNodes();
        }

}
