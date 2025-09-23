package com.tnsif.arraydemo;

public class JaggedDemo{
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3},{4},{5, 6},{3, 3, 4, 5, 9}};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
