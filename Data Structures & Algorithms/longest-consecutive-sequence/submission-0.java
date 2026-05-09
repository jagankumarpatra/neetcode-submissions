class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        int n = nums.length;
        int i = 0, j = 0;
        int val =0;

        for (i = 0; i < n; i++) {
            if (!hm.containsKey(nums[i] - 1)) { // only start counting from sequence start
                int cnt = 0;
                int cur = nums[i];
                while (hm.containsKey(cur)) {
                    cnt++;
                    cur++; // keep moving to next consecutive
                }
                val = Math.max(val, cnt);
            }
        }
        return val;
    }
}
