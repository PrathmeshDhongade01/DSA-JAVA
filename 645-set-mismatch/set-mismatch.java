class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int missing = -1;
        int dublicate = -1;

        for(int i =0;i<n;i++){
            int value = Math.abs(nums[i]);
            int position = value - 1;

            if(nums[position]<0){
                dublicate = value;
            }
            else{
                nums[position] = -nums[position];
            }
        }

        for(int i =0 ; i<n;i++){
            if(nums[i]>0){
                missing = i+1;
                break;

            }
        }

        return new int[]{dublicate,missing};
        
    }
}