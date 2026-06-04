class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // current temp is warmer than stack top
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int idx = st.pop();
                result[idx] = i - idx; // days waited
            }
            st.push(i);
        }

        return result;
    }
}