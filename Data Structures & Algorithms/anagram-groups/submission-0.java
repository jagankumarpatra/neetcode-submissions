class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        for(String i: strs){
            char ch[]= i.toCharArray();
            Arrays.sort(ch);
            String res= new String(ch);
            if(!hm.containsKey(res)) {
                hm.put(res,new ArrayList<>());
            }
            hm.get(res).add(i);
        }
  return new ArrayList<>(hm.values());
    }
}
