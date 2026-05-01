class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totalSum=n*(n+1)/2;
        int rangeSum=0;
        for(int num : nums) rangeSum+=num;

        return totalSum - rangeSum;
    }
}