class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i : nums){
            map.put(i, (map.getOrDefault(i,0)+1));
        }
        List<Integer> ans= new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>nums.length/3){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}