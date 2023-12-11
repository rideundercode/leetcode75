public class Solution {

    public static void main(String[] args) {
        String s = "Le     ciel est    bleu";
        String result = reverseWords(s);
        System.out.println(result);
    }

    private static String reverseWords(String s) {
        char[] characters = s.toCharArray();
        int n = characters.length;

        reverse(characters, 0, n - 1);
        reverseWord(characters, n);
        cleanspaces(characters, n); // Cleanspaces will modify 'characters' directly

        // Find the position of '\0' to determine the effective length
        int effectiveLength = 0;
        while (effectiveLength < characters.length && characters[effectiveLength] != '\0') {
            effectiveLength++;
        }

        return new String(characters, 0, effectiveLength);
    }

    private static void cleanspaces(char[] s, int n){
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && s[j] == ' ') j++;             
            while (j < n && s[j] != ' ') s[i++] = s[j++]; 
            while (j < n && s[j] == ' ') j++;             
            if (j < n) s[i++] = ' ';                      
        }

        // Mark the end of the effective string
        if (i < n) s[i] = '\0'; 
    }

    private static void reverseWord(char[] s, int n){
        int i = 0, j = 0;

        while(i < n){ 
            if(s[i] != ' '){
                j = i;
                while(j < n && s[j] != ' '){
                    j++;
                }
                reverse(s, i, j - 1); 
                i = j;
            }
            i++;
        }
    }

    private static void reverse(char[] s, int i, int j) {
        while (i < j) {
            char t = s[i];
            s[i++] = s[j];
            s[j--] = t;
        }
    }
}
