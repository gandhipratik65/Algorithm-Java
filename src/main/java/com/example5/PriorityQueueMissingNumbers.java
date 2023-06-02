package com.example5;

import java.util.PriorityQueue;

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
