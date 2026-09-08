class Solution {
    public int countCommas(int n) {
        long totalCommas = 0;
        for (long threshold = 1000; n >= threshold; threshold *= 1000) {
            totalCommas += (n - threshold + 1);
        }
        return (int) totalCommas;
    }
}
