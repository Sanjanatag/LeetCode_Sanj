class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
             List<List<Integer>> ans= new ArrayList<>();
       Arrays.sort(nums); 
        
        for(int i=0;i<nums.length;i++){
              if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j=i+1; int k= nums.length-1;
            while(k>j){
                if(nums[j]+nums[k]>(-nums[i])){
                    k--;
                }
                else if(nums[j]+nums[k]<(-nums[i])){
                    j++;
                }
                else{
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;

                }
            }   
        }
        return ans;
    }
}