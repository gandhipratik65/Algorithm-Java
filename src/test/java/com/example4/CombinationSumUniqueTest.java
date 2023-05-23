package com.example4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumUniqueTest {

    CombinationSumUnique combinationSumUnique = new CombinationSumUnique();


    @Test
    void testCombinationSumUnique(){
        System.out.println(combinationSumUnique.combinationSum2(new int[]{2,5,2,1,2},5));
    }

}