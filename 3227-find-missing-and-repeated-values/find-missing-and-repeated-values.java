class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        Set<Integer> set = new HashSet<>();
        int repeated =-1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(set.contains(grid[i][j])){
                    repeated=grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        int missing=-1;
        int total=n*n;
        for(int i=0;i<=total;i++){
            if(!set.contains(i)) missing=i;
        }
        int[] arr = {repeated, missing};
        return arr ;
    }
}