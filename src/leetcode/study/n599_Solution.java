package leetcode.datastructure;

class n599_Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<Integer, List> map = new HashMap<Integer, List>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (!map.containsKey(i+j)) {
                        ArrayList<String> lists = new ArrayList<String>();
                        lists.add(list1[i]);
                        map.put(i + j, lists);
                    } else {
                        map.get(i + j).add(list1[i]);
                    }
                }
            }
        }

        int maxValue = Integer.MAX_VALUE;
        for (Iterator<Integer> iterator = map.keySet().iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            maxValue = next < maxValue ? next : maxValue;
        }
        String[] res = new String[map.get(maxValue).size()];
        return (String[]) map.get(maxValue).toArray(res);
    }
}