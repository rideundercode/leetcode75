class Solution {

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;

        Boolean result = canPlaceFlowers( flowerbed,  n);
        System.out.println("Result 1: " + result);
    }
    
    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        if (n == 0)
            return true; 
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == len - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; 
                count++;
                if (count >= n) {
                    return true; 
                }
            }
        }
        return false; 
    }
    
        

}
