// 电话号码的字母组合
// 使用回溯算法进行求解，回溯算法其实效率也不是很高
// 因为也是需要全部遍历的
// 注意，这里字母是不重复的，如果有重复的，需要使用set去除重复的组合


class 17_Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits.length() == 0) {
            return res;
        }
        Map<Character,String> map = new HashMap<Character,String>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        StringBuilder sb = new StringBuilder();
        trace(0,map,res,sb,digits);
        return res;
    }

    public void trace(int index,Map<Character,String> map,List<String> res,StringBuilder sb,String digits) {
        // 结束条件
        if (index == digits.length()) {
            res.add(sb.toString());
            // return res;
        } else {
            Character c = digits.charAt(index);
            String s = map.get(c);
            int len = s.length();
            for (int i=0;i<len;i++) {
                // 递归前处理
                sb = sb.append(s.charAt(i));
                trace(index + 1,map,res,sb,digits);
                // 递归后处理，回溯回来的处理
                sb.deleteCharAt(index);
            }
        }
    }
}