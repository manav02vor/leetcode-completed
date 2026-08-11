// ==========================================================
// 561. Array Partition
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 17 ms (Beats 81%)
// Memory     : 49.5 MB (Beats 87%)
// Link       : https://leetcode.com/problems/array-partition/
// ==========================================================

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for(int i = 0 ; i < nums.length; i += 2){
            sum += nums[i];
        }
        return sum;
    }
}