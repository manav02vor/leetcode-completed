// ==========================================================
// 860. Lemonade Change
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 98%)
// Memory     : 72.3 MB (Beats 86%)
// Link       : https://leetcode.com/problems/lemonade-change/
// ==========================================================

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int bill : bills){
            if(bill == 5){
                five++;

            } 
            else if (bill == 10){

                if(five == 0)return false;
                five --;
                ten ++;
            }
            else{