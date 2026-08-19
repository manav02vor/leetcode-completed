// ==========================================================
// 485. Max Consecutive Ones
// Difficulty : Easy
// Language   : Java
// Solution   : #3
// Runtime    : 2 ms (Beats 98%)
// Memory     : 52.6 MB (Beats 47%)
// Link       : https://leetcode.com/problems/max-consecutive-ones/
// ==========================================================

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;

                if (count > max) {
                    max = count;
                }

            } else {
                count = 0;
            }
        }

        return max;
    }
}