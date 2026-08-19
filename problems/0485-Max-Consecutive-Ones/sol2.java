// ==========================================================
// 485. Max Consecutive Ones
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 2 ms (Beats 98%)
// Memory     : 52.4 MB (Beats 67%)
// Link       : https://leetcode.com/problems/max-consecutive-ones/
// ==========================================================

            if(nums[i] == 1){
                count++;
            }
                if(nums[i] !=1){
                    count =0;
                    max = max;
                }
                if(count > max){
                    max = count;
                }
                
            }
        
        return max;
    }
        for(int i = 0;i < nums.length;i++){
        int max =0;
        int count = 0;
    public int findMaxConsecutiveOnes(int[] nums) {
class Solution {