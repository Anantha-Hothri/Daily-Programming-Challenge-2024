class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length + 1;
        int org_sum = (n*(n+1))/2;
        int arr_sum = 0;
        for(int i=0; i<n; i++){
            arr_sum += nums[i];
        }
        int result = org_sum - arr_sum;
        return result;
    }
}
