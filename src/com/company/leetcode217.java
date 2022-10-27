package com.company;

import java.util.HashMap;

public class leetcode217 {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                return false;
            else
                hm.put(nums[i], 0);
        }
        return true;
    }

    public static void main(String[] args){

        leetcode217 leetcode217 = new leetcode217();
        System.out.println(leetcode217.containsDuplicate(new int[] {1, 2, 3, 1}));

    }
}
