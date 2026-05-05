class Solution {
    public int[] topKFrequent(int[] nums, int k) {
           int n=nums.length;
           int arr[]=new int[k];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        List<int[]> newArr= new ArrayList<>();
        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
            newArr.add(new int[] {e.getValue(),e.getKey()});
        }
            newArr.sort((a,b)-> b[0]-a[0]);
            for(int i=0;i<k;i++){
                arr[i]=newArr.get(i)[1];
           
            }
        
        return arr;
    }
}
