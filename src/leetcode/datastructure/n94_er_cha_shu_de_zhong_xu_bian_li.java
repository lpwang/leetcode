package leetcode.datastructure;

import java.util.ArrayList;
import java.util.List;

public class n94_er_cha_shu_de_zhong_xu_bian_li {
    public static void main(String[] args) {

    }
}


class Solution94 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        return binary(res,root);
    }

    public List<Integer> binary(ArrayList<Integer> res,TreeNode node) {
        if (null != node) {
            if (null != node.left) {
                binary(res,node.left);
            }
            res.add(node.val);
            if (null != node.right) {
                binary(res,node.right);
            }
        }
        return res;
    }
}