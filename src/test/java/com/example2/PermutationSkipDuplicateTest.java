package com.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;



class PermutationSkipDuplicateTest {
    PermutationSkipDuplicate permutation = new PermutationSkipDuplicate();

    @Test
    void testPermutation(){

        System.out.println(permutation.subsetsWithDup(new int[]{1,2,2,3,4,5}));

        List<List<Integer>>  actualPermutation =permutation.subsetsWithDup(new int[]{1,2,2,3,4,5});
        Assertions.assertEquals(Arrays.asList(1),actualPermutation.get(1));
        Assertions.assertEquals(Arrays.asList(1,2),actualPermutation.get(2));
        Assertions.assertEquals(Arrays.asList(1,2,2),actualPermutation.get(3));

    }
}