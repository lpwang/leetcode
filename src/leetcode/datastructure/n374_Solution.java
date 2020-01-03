package src.leetcode.datastructure;

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class n374_Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);
            if (res == -1) {
                end = mid - 1;
            } else if (res == 1) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}