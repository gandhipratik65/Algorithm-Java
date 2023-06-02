package com.example5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestMissingTest {


    SmallestMissing smallestMissing  = new SmallestMissing();

    @Test
    void smallestMissingTest(){
        System.out.println( smallestMissing.firstMissingPositive(new int[]{3,4,-1,1}));
    }

}