class Solution {
    public int removeElement(int[] nums, int val) {
        int[] expectedNums = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]!=val){
                expectedNums[i] = nums[i];
            }
        }
        return expectedNums.length;
    }
}
