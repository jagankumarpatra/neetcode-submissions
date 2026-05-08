
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
                arr[0]=i+1;
                arr[1]=hm.get(val)+1;
                break;
            }
        }
         if (arr[0] > arr[1]) {
        int temp = arr[0]; 
        arr[0] = arr[1];   
        arr[1] = temp;
    }
    return arr;
    }
}
