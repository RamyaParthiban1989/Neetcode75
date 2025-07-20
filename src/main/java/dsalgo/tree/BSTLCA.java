package dsalgo.tree;


import lombok.val;
import org.antlr.v4.runtime.tree.Tree;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

// Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class BSTLCA {
    static List<TreeNode> allAncestors = new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    List<TreeNode> ancestorP = traversal(root,p);
    return null;
    }

    static List<TreeNode> traversal(TreeNode root, TreeNode target){

        if(root.val==target.val){
            allAncestors.add(root);
        }
        if(root.val>target.val){
            if(root.left!=null)
            {
                allAncestors.add(root);
                traversal(root.left,target);

            }
        }else if(root.val<target.val) {
            if (root.right != null) {
                allAncestors.add(root);
                traversal(root.right, target);
            }
        }
        return allAncestors;
    }

    public static void main(String[] args) {
       /* TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(4);
        node.left.left.right = new TreeNode(2);

        node.right.left = new TreeNode(7);
        node.right.right = new TreeNode(9);*/
        Integer[] levelOrder = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
        TreeNode root = buildTreeFromLevelOrder(levelOrder);

        TreeNode p = findNode(root, 3);
        TreeNode q = findNode(root, 5);

      //  System.out.println(bstlca.printCommonAncestors(root, p,q ).val);
        List<TreeNode> allAncestors1 = traversal(root,p);
        allAncestors = new ArrayList<>();
        List<TreeNode> allAncestors9 = traversal(root,q);
        TreeNode lca = new BSTLCA().findlca(allAncestors9,allAncestors1);
        System.out.println(lca.val);
    }

    private TreeNode findlca(List<TreeNode> allAncestors9, List<TreeNode> allAncestors1) {
        TreeNode lca=null;
        Set<TreeNode> commonlca = new HashSet<>();
        AtomicReference<TreeNode> min = new AtomicReference<>(null);
        for(TreeNode n : allAncestors1){
            if(allAncestors9.contains(n)){
                if(Objects.isNull(min.get())) {
                    min.set(n);
                }
                else {
                    if (min.get().val > n.val)
                        min.set(n);
                }
            }
        }
        return min.get();
    }

    public static TreeNode buildTreeFromLevelOrder(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while (i < values.length) {
            TreeNode current = queue.poll();

            if (i < values.length && values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }


    // Find a TreeNode with given target value in BST
    public static TreeNode findNode(TreeNode root, int target) {
        if (root == null) return null;
        if (root.val == target) return root;
        else if (target < root.val) return findNode(root.left, target);
        else return findNode(root.right, target);
    }
}
