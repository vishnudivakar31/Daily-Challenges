package edu.njit;

public class Main {

    public static void main(String[] args) {
	    System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int max = 0, secondMax = 0, start = -1, stop = 0;
        boolean isSecondMax = false;
        for(int i = 0; i < height.length; i++) {
            if(height[i] >= max) {
                max = height[i];
                if(start == -1) {
                    start = i;
                } else if(start > -1 && !isSecondMax) {
                    stop = i;
                }
            }
            if(height[i] > secondMax) {
                secondMax = height[i];
                stop = i;
                isSecondMax = true;
            }
        }
        if(isSecondMax) {
            return secondMax * (stop - start);
        } else {
            return max * (stop - start);
        }
    }
}
