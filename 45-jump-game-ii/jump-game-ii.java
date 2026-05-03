class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int coverage=0;
        int destination=nums.length-1;
        int lastJumpIndex=0;
        if(nums.length==1 ) return 0;
        for(int i=0;i<nums.length-1;i++){
            coverage = Math.max(coverage,i+nums[i]);
            if(i==lastJumpIndex){
                lastJumpIndex=coverage;
                jumps++;
            }
            
        }

        return jumps;
    }
}