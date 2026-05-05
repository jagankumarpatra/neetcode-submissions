class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int [2];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int val= target-nums[i];
            if(hm.containsKey(val) && hm.get(val) != i){
                arr[0]=i;
                arr[1]=hm.get(val);
                break;
            }
        }
         if (arr[0] > arr[1]) {
        // 2. If they are in the wrong order, swap them
        int temp = arr[0]; // Store first element temporarily
        arr[0] = arr[1];   // Move second element to first position
        arr[1] = temp;     // Move temporary value to second position
    }
    // 3. Return the modified array
    return arr;
    }
}
