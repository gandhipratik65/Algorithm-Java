package com.example1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PermutationTest {

    Permutation permutation = new Permutation();

    @Test
    void testPermutation(){

        List<List<Integer>>  actualPermutation =permutation.subsets(new int[]{1,2});
        Assertions.assertEquals(Arrays.asList(1),actualPermutation.get(1));
        Assertions.assertEquals(Arrays.asList(1,2),actualPermutation.get(2));
        Assertions.assertEquals(Arrays.asList(2),actualPermutation.get(3));

    }

}