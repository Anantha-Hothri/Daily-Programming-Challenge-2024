class Solution {
    public int findDuplicate(int[] nums) {
        int max_element = Integer.MIN_VALUE;
        for( int i=0; i<nums.length; i++){
            max_element = Math.max(max_element, nums[i]);
        }
        int count[] = new int[max_element+1];
        int countmax = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            count[x]++;
        }

        for(int i=0; i<count.length; i++){
            if(count[i] > 0){
                countmax = Math.max(count[i], countmax);
            }
        }

        for(int i=0; i<count.length; i++){
            if(count[i] == countmax){
                return i;
            }
        }
        return -1;
    }
    }
