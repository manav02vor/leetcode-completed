// ==========================================================
// 2073. Time Needed to Buy Tickets
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 11 ms (Beats 19%)
// Memory     : 46.5 MB (Beats 9%)
// Link       : https://leetcode.com/problems/time-needed-to-buy-tickets/
// ==========================================================

import java.util.*;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new LinkedList<>();

        // Store person indexes in queue
        for (int i = 0; i < tickets.length; i++) {
            q.add(i);
        }

        int time = 0;

        while (!q.isEmpty()) {

            int person = q.poll();

            
            tickets[person]--;
            time++;

            
            if (person == k && tickets[person] == 0) {
                return time;
            }

            // If tickets still remaining, go to back of queue
            if (tickets[person] > 0) {
                q.add(person);
            }
        }

        return time;
    }
}