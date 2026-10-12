// ==========================================================
// 973. K Closest Points to Origin
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 21 ms (Beats 95%)
// Memory     : 61.2 MB (Beats 6%)
// Link       : https://leetcode.com/problems/k-closest-points-to-origin/
// ==========================================================

class Solution {
    public int[][] kClosest(int[][] points, int K) {
    Arrays.sort(points, (p1, p2) -> p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]);
    return Arrays.copyOfRange(points, 0, K);
}
}