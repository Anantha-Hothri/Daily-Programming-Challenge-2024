class Solution {
    public void sortColors(int[] nums) {
        int count[] = new int[3];
        for(int i=0; i<nums.length; i++){
            int ele = nums[i];
            count[ele]++;
        }
        int j =0;
        for(int i=0; i<count.length; i++){
            while(j<nums.length && count[i] > 0){
                nums[j] = i;
                j++;
                count[i] --;
            }
        }
    }
}
