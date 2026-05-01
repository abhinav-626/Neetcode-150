class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n*n;
        long expectedSum=(long)total*(total+1)/2;
        long expectedSqSum=(long)total*(total+1) * (2*total+1)/6;

        long actualSum=0;
        long actualSqSum=0;
        for(int[] row:grid){
            for(int num:row){
                actualSum+=num;
                actualSqSum+=(long)(num*num);
            }

        }
        long diff = actualSum - expectedSum;
        long sqDiff=actualSqSum - expectedSqSum;
        long sum=sqDiff/diff;
        int x = (int)((diff+sum)/2);
        int y = (int)(x-diff);
        
        return new int[]{x,y};
    }
}