class Solution {
    public void sortColors(int[] nums) {
        int i=0; int left=0; int right=nums.length-1;
        while(i<=right){
           if(nums[i]==0){
            swap(nums, i, left);
            left++;
           }
           if(nums[i]==2){
            swap(nums, i, right);
            i--;
            right--;
           }
           i++;
        }
    }
    private void swap( int[] nums, int a, int b){
        int temp= nums[a];
        nums[a]= nums[b];
        nums[b]=temp;
    }
}