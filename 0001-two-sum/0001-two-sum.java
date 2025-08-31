class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap <Integer, Integer> map= new HashMap<>();
        for (int num = 0; num < nums.length; num++) {
            map.put(num, nums[num]); 
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsValue(target-nums[i])){
                for(int j=0;j<nums.length;j++){
                    if (nums[j]== target-nums[i] && j!=i)
                     return new int[] {i,j};
                }      
        }
    }
      return new int[] {};
    }
}