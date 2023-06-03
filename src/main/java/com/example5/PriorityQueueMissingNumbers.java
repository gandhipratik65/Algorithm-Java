package com.example5;

import java.util.PriorityQueue;

/**
 * Leet Code 41
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 *
 * You must implement an algorithm that runs in O(n) time and uses constant extra space.
 *
 *
 */
public class PriorityQueueMissingNumbers {

    public int firstMissingPositive(int[] nums)
    {
        int i = 1;
        PriorityQueue<Integer> q = new PriorityQueue();
        for (int j = 0; j < nums.length; ++j)
        {
            if (nums[j] > i)
                q.add(nums[j]);
            if (nums[j] == i)
                i++;
        }
        while (!q.isEmpty())
        {
            if(q.peek() == i)
            {
                i++;
            }
            else if(q.peek()>i) return i;
            q.poll();
        }
        return i;
    }
}
