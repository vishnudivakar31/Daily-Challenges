package edu.njit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    System.out.println(threeSum(new int[] {1, -1, -1, -0}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> triplets = null;
        List<String> tripletCache = new ArrayList<String>();
        int sum = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            sum = nums[i];
            triplets = null;
            for(int j = i + 1; j < nums.length; j++) {
                if(triplets == null) {
                    triplets = new ArrayList<Integer>();
                    triplets.add(nums[i]);
                }
                sum += nums[j];
                triplets.add(nums[j]);
                if(triplets.size() == 3) {
                    if(sum == 0) {
                        Collections.sort(triplets);
                        if(!tripletCache.contains(triplets.toString())) {
                            result.add(triplets);
                            tripletCache.add(triplets.toString());
                        }
                    }
                    triplets = null;
                    sum = nums[i];
                }
            }
        }
        return result;
    }
}
