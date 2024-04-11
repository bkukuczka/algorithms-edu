package bkukuczka.algorithmsedu.hackerrank;

import java.util.stream.Collectors;

class SpecialPalindrome {

    /*
     * Complete the 'substrCount' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING s
     */
    public static long substrCount(int n, String s) {
        int result = n;

        for (int i = 2; i <= n; i++) { //string size
            for (int j = 0; j <= n - i; j++) { //substr begin
                if (isSpecial(s.substring(j, j + i))) {
                    result++;
                }
            }
        }

        return result;
    }

    public static boolean isSpecial(String s) {
        return s.chars().mapToObj(it -> (char) it).collect(Collectors.toSet()).size() <= 2
                && new StringBuilder(s).reverse().toString().equals(s);
    }
}

