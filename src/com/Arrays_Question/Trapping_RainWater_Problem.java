package com.Arrays_Question;

import java.util.Arrays;

public class Trapping_RainWater_Problem {
    public static int waterTrapped (int [] buildingHeight){
        int n = buildingHeight.length;

        int [] left = new int[buildingHeight.length];
        int max = buildingHeight[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(buildingHeight[i], max);
            left[i] = max;
        }

        int [] right = new int[buildingHeight.length];
        max = buildingHeight[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(buildingHeight[i], max);
            right[i] = max;
        }

        int totalWaterTrapped = 0;
        for (int i = 1; i < n - 1; i++) {
            totalWaterTrapped += Math.min (left[i], right[i]) - buildingHeight[i];
        }

        return totalWaterTrapped;
    }

    public static void main(String[] args) {
        int [] arr = {3, 1, 2, 4, 0, 1, 3, 2};

        System.out.println (waterTrapped (arr));
    }
}
