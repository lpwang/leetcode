class n705_Solution {

    private List<Integer>[] sets = null;

        /** Initialize your data structure here. */
        public MyHashSet() {
            sets = (List<Integer>[])new ArrayList[1024];
        }

        public void add(int key) {
            int index = getIndex(key);
            List<Integer> set = null;
            if (sets[index] == null) {
                set = new ArrayList<Integer>();
                sets[index] = set;
            } else {
                set = sets[index];
            }
            if (!contains(key)) {
                set.add(key);
            }
        }

        public void remove(int key) {
            int index = getIndex(key);
            int point = 0 ;
            if (sets[index] != null && (point = getPoint(index,key)) != sets[index].size() ) {
                sets[index].remove(point);
            }
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            int index = getIndex(key);
            if ( sets[index] != null && getPoint(index,key) != sets[index].size() ) {
                return true;
            }
            return false;
        }

        private int getIndex(int key) {
            return key % 1024;
        }

        private int getPoint(int index , int key) {
            List<Integer> set = sets[index];
            int point = set.size();
            for (int i=0;i<set.size();i++) {
                if (set.get(i) == key) {
                    point = i;
                    break;
                }
            }
            return point;
        }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */