package com.example5;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SmallestMissing {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        OptionalInt max = IntStream.of(nums).max();
        int[] positiveNums = IntStream.of(nums).filter(i -> i>0).toArray();
        for (int i = 0; i < max.getAsInt(); i++) {
            if(positiveNums[i] != i+1){
                return i+1;
            }
        }
        return 0;
    }
}
