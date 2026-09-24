// ==========================================================
// 686. Repeated String Match
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 260 ms (Beats 73%)
// Memory     : 43.7 MB (Beats 61%)
// Link       : https://leetcode.com/problems/repeated-string-match/
// ==========================================================

class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        if(sb.indexOf(b) != -1){
            return count;
        }
        sb.append(a);
        count++;
        if(sb.indexOf(b) != -1){
            return count;
        }
        return -1;
    }
    
}