public class n706_Solution {

    private static class Node {
        private int key;
        private int val;

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }

    private List<Node>[] bucket = null;

    /** Initialize your data structure here. */
    public MyHashMap() {
        bucket = (List<Node>[]) new ArrayList[1024];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        Node node = new Node();
        node.setKey(key);
        node.setVal(value);
        int index = getIndex(key);
        List<Node> list = bucket[index];
        if (null == list) {
            ArrayList<Node> nodes = new ArrayList<>();
            nodes.add(node);
            bucket[index] = nodes;
        } else {
            int point = getPoint(index, key);
            if (-1 == point) {
                list.add(node);
            } else {
                // 更新val
                list.get(point).setVal(value);
            }

        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = getIndex(key);
        List<Node> list = bucket[index];
        if (null == list) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            int nodeKey = list.get(i).getKey();
            if (nodeKey == key) {
                return list.get(i).getVal();
            }
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = getIndex(key);
        List<Node> list = bucket[index];
        if (null != list) {
            int point = getPoint(index, key);
            if (-1 != point) {
                list.remove(point);
            }
        }
    }

    private int getIndex(int key) {
        return key % 1024;
    }

    private int getPoint(int index, int key) {
        List<Node> list = bucket[index];
        for (int i = 0; i < list.size(); i++) {
            int nodeKey = list.get(i).getKey();
            if (nodeKey == key) {
                return i;
            }
        }
        return -1;
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */