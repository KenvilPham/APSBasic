package com.home.apsbasic.leetcode.arrays;

public class SolutionArraysLeetcode {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int index = 0;
        int[] A = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                A[index]++;
            } else {
                index++;
                continue;
            }
        }
        for (int k = 0; k <= index; k++){
            if (max <= A[k]){
                max = A[k];
            }
        }
        return max;
    }

    public static int findNumbers(int[] nums) {
        int index = 0;
        int countDigit = 0;
        while (index < nums.length) {
            int count = 1;
            while (nums[index] / 10 != 0) {
                count++;
                nums[index] = nums[index] / 10;
            }
            if (count % 2 == 0) {
                countDigit++;
            }
            index++;
        }
        return countDigit;
    }

    public static int[] sortedSquares(int[] nums) {
        int[]A = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            A[i] = nums[i] * nums[i];
        }

        for (int j = 0; j < A.length; j++) {
            for (int k = j+1; k < A.length; k++){
                if (A[k] < A[j]) {
                    int temp = A[j];
                    A[j] = A[k];
                    A[k] = temp;
                }
            }
        }
        return A;
    }

    public static int findMaxConsecutiveOnes2(int[] nums) {
        int max =0;
        int dem =0;
        int length = nums.length;
        for(int i=0; i <length ; i++) {
            if(nums[i]==1) {
                dem++;
            }
            if(max <= dem) {
                max =dem;
            }
            if(nums[i] ==0) {
                dem =0;
            }
        }
        return max;
    }

    public static void duplicateZeros(int[] arr) {
        int[]brr = new int[arr.length + 100];

        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (brr[i] == 0) {
                int index = i+1;
                for (int j = arr.length-1; j >= index; j--){
                    brr[j+1] = brr[j];
                }
                brr[index] = 0;
                i++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = brr[i];
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        for (i = m, j = 0; i < (m+n); i++, j++) {
            nums1[i] = nums2[j];
        }
        for (int k = 0; k < (n+m); k++) {
            for (int l = k+1; l <(n+m); l++){
                if (nums1[l] < nums1[k]) {
                    int temp = nums1[l];
                    nums1[l] = nums1[k];
                    nums1[k] = temp;
                }
            }
        }
    }

    public static int removeElement(int[] nums, int val) {
        int lengthNewArr = nums.length;
        for (int i = 0; i < lengthNewArr; i++) {
            if (nums[i] == val) {
                for (int j = i+1; j < lengthNewArr; j++){
                    nums[j-1] = nums[j];
                }
                lengthNewArr--;
            }
            if (nums[i] == val){
                i--;
            }
        }
        for (int k = 0; k < lengthNewArr; k++){
            System.out.printf(" %d" , nums[k]);
        }
        return lengthNewArr;
    }

    public static int removeDuplicates(int[] nums) {
        int lengthNewArr = nums.length;
        boolean mark = false;
        for (int i = 0; i < lengthNewArr; i++) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i + 1; j < lengthNewArr; j++) {
                    nums[j - 1] = nums[j];
                }
                lengthNewArr--;
                mark = true;
            }
            if (nums[i] == nums[i+1] && mark) {
                i--;
                mark = false;
            }
        }

        int len2 = lengthNewArr+1;
        for (int k = 0; k < len2; k++){
            System.out.printf(" %d" , nums[k]);
        }
        return len2;
    }

    public static void main(String[] args) {
	// write your code here
        int[] test = {1,1,1,2,3,3,0,6,5,4,6,8,6,5,4};
    }
}
