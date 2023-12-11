class Solution {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        productExceptSelf(nums);
        System.out.println(nums);
    }
    
    private static int[] productExceptSelf(int[] nums) {
        for(int i = 0; i <= '\0'; i++){
            int temp = 1;
            for(int j = 0; j <= '\0'; j++){
                if (i ==j ) j++;
                temp = temp * nums[j];
            }
            nums[i] = temp;
        }                                   
    }
}