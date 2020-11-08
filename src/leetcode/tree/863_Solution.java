/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 广度优先算法
// 先使用深度优先+Map数据结构保存节点的父节点信息，然后根据广度优先搜索进行数据的层级遍历，最后获取queue中的结果进行输出。
class 863_Solution {
    private Map<TreeNode, TreeNode> parentMap = null;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        // 使用map保存treeNode的父节点
        parentMap = new HashMap<TreeNode, TreeNode>();
        parentMap(root, null, parentMap);
        int distance = 0;
        if (K == distance) {
            ArrayList<Integer> res = new ArrayList<Integer>();
            res.add(target.val);
            return res;
        }
        Set<TreeNode> seen = new HashSet<TreeNode>();
        seen.add(target);

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(target);

        while (distance < K && !queue.isEmpty()) {
            int len = queue.size();
            for (int i=0;i<len;i++) {
                TreeNode node =  queue.poll();
                if (node != null) {
                    // left
                    if (!seen.contains(node.left)) {
                        seen.add(node.left);
                        queue.offer(node.left);
                    }
                    // right
                    if (!seen.contains(node.right)) {
                        seen.add(node.right);
                        queue.offer(node.right);
                    }
                    // parent
                    if (!seen.contains(parentMap.get(node))) {
                        seen.add(parentMap.get(node));
                        queue.offer(parentMap.get(node));
                    }
                }                
            }
            distance++;
        }

        // 获取queue的数据
        List<Integer> res = new ArrayList<Integer>(queue.size());
        for (TreeNode treeNode : queue) {
            if (treeNode != null) {
                res.add(treeNode.val);
            }
        }
        return res;
    }

    public void parentMap(TreeNode node,TreeNode parentNode,Map<TreeNode,TreeNode> parentMap) {
        if (null != node) {
            parentMap.put(node, parentNode);
            parentMap(node.left, node, parentMap);
            parentMap(node.right, node, parentMap);
        }
    }
}
