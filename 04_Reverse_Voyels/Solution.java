public class Solution {

    public static void main(String[] args) {
        String s = "hello";
        String result = reverseVowels(s);
        System.out.println(result); 

        s = "leetcode";
        result = reverseVowels(s);
        System.out.println(result); 

        s = "Yo! Bottoms up, U.S. Motto, boy!";
        result = reverseVowels(s);
        System.out.println(result); 

        s = "aA";
        result = reverseVowels(s);
        System.out.println(result); 
    }

    public static String reverseVowels(String s) {
        if (s == null) {
            return null;
        }
        char[] characters = s.toCharArray();
        int i = 0;
        int j = characters.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (i < j) {
            while (i < j && vowels.indexOf(characters[i]) == -1) {
                i++;
            }
            while (i < j && vowels.indexOf(characters[j]) == -1) {
                j--;
            }
            if (i < j) {
                char temp = characters[i];
                characters[i] = characters[j];
                characters[j] = temp;
                
                i++;
                j--;
            }
        }
        
        return new String(characters);
    }
}
