// ==========================================================
// 1672. Richest Customer Wealth
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.6 MB (Beats 56%)
// Link       : https://leetcode.com/problems/richest-customer-wealth/
// ==========================================================


            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
            if (sum > max) {
                sum += accounts[i][j];
            }

                max = sum;
        for (int i = 0; i < accounts.length; i++) {

        int max = 0;

    public int maximumWealth(int[][] accounts) {
class Solution {