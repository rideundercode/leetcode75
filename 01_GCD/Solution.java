class Solution {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        String result = gcdOfStrings(str1, str2);
        System.out.println("Output: " + result);
    }

    public static String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int gcdLength = gcd(len1, len2); // trouver le pgcd entre str1 et str2

        String substring = str1.substring(0, gcdLength); // extraire la substring

        //vérifier si une sous-chaîne répétée substring forme à la fois str1 et str2,
        if (str1.equals(repeat(substring, len1 / gcdLength)) && str2.equals(repeat(substring, len2 / gcdLength))) {
            return substring;
        } else {
            return "";
        }
    }

    // calcul le pgcd
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // repéter la substring n fois
    private static String repeat(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(s);
        }
        return result.toString();
    }
}