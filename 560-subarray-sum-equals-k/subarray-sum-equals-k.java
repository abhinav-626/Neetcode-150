//Brute Force Approach

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int count=0;
//         for(int i =0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum=sum + nums[j];
//                 if(sum==k) count++;

//             }
//         }
//         return count;
//     }
// }

//Optimal Apporach
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int result=0; 
        int prefixSum=0;
        for(int num:nums){
            prefixSum+=num;
            if(map.containsKey(prefixSum-k)){
                result+=map.get(prefixSum-k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);

        }
        return result;
    }
}