// 找到 K 个最接近的元素
// 二分法 + 双指针
// 回头再算吧，细节有魔鬼
class n658_Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int r = arr.length - 1;
        int index = 0;
        if (arr[l] >= x) {
            return Arrays.stream(Arrays.copyOfRange(arr, l, k)).boxed().collect(Collectors.toList());
        }
        if (arr[r] <= x) {
            return Arrays.stream(Arrays.copyOfRange(arr, arr.length - k, arr.length))
                    .boxed().collect(Collectors.toList());
        }
        // 二分查找，找到存在或者不存在的值
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        // 使用双指针进行，两头夹逼操作
        index = l - 1;
        int lf = index - k <= 0 ? 0 : index - k;
        int rf = index + k >= arr.length - 1 ? arr.length - 1 : index + k;
        while (rf - lf > k) {
            if (arr[rf] - x >= x - arr[lf]) {
                rf--;
            } else {
                lf++;
            }
        }
        return Arrays.stream(Arrays.copyOfRange(arr, lf, rf))
                .boxed().collect(Collectors.toList());
    }
}