// ==========================================================
// 3074. Apple Redistribution into Boxes
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 32%)
// Memory     : 44.5 MB (Beats 44%)
// Link       : https://leetcode.com/problems/apple-redistribution-into-boxes/
// ==========================================================



        int count = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {

            count++;

            total = total - capacity[i];
            if (total <= 0) {
                break;
            }
        }

        return count;
    }
}