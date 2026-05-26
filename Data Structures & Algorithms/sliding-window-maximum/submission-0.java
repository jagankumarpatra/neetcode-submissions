class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        
        // For each window starting at index i
        for (int i = 0; i <= n - k; i++) {
            int max = nums[i];
            // Check all k elements in this window
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            result[i] = max;
        }
        
        return result;
    }
}