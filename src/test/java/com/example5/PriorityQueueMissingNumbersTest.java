package com.example5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueMissingNumbersTest {

    PriorityQueueMissingNumbers priorityQueueMissingNumbers = new PriorityQueueMissingNumbers();

    @Test
    void setPriorityQueueMissingNumbersTest(){
       // System.out.println(priorityQueueMissingNumbers.firstMissingPositive(new int[]{-1,2,3}));
        System.out.println(priorityQueueMissingNumbers.firstMissingPositive(new int[]{3,4,-1,1}));

    }
}