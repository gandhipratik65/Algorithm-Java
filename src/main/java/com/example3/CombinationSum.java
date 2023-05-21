package com.example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        helper(0,nums, target, new ArrayList<>(), finalList);
        return finalList;

    }

    public void helper(int index, int[] arr, int target, ArrayList<Integer> list, List<List<Integer>> finalList){
        if(index == arr.length){
            if(target == 0){
                finalList.add(new ArrayList<>(list));
            }
            return;
        }
        if(target >= arr[index]){
            list.add(arr[index]);
            helper(index, arr, target-arr[index],list,finalList);
            list.remove(list.size()-1);
        }
        helper(index+1, arr,target,list,finalList);
    }
}
