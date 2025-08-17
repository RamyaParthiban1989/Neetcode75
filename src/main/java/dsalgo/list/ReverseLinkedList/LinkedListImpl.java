package dsalgo.list.ReverseLinkedList;


/*
 * Definition for singly-linked list.
 *
 * Input: head = [0,1,2,3]

Output: [3,2,1,0]

 */
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }




  }

  public class LinkedListImpl{

       ListNode root;

        public void insert(int data){
              if(root==null){
                 root = new ListNode(data);
                 return;
              }
              ListNode n = root;
              while(n.next!=null){
                    n =n.next;
              }
              ListNode newNode = new ListNode(data);
              n.next = newNode;
             // return newNode;
        }


        public void display(ListNode root){
            ListNode n = root;
            System.out.println("display:  ");
            while(n.next!=null){
                System.out.print("\t" +n.val);
                n=n.next;
            }
            System.out.print("\t"+n.val);
        }

        public ListNode reverseList(ListNode curr, ListNode prev){
            if(curr==null){
              return prev;
            }
            ListNode next = curr.next;
            curr.next = prev;
            return reverseList(next,curr);
        }

        public void reverse(){
            ListNode reverseHead = reverseList(root,null);
            System.out.println("Reverse Head: "+reverseHead.val);
            root = reverseHead;
        }

      public void removeNthNodeFromEnd(ListNode root,int n){
          //ListNode reverseHead = reverseList(root,null);
          //root =reverseHead;
          int i=1;
          ListNode prev = null;
          ListNode curr = root;
          ListNode next = curr.next;
          while(i<=n-1){
              prev =curr;
              curr = curr.next;
              i++;
          }
          prev.next = curr.next;
      }

      public void removeNthNodeFromEndList(int n){
          removeNthNodeFromEnd(root, n);
      }

      public void displayAllNodes(){
            display(root);
      }
  }



